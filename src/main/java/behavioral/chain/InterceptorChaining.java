package behavioral.chain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InterceptorChaining {

    interface Interceptor {
        void doNext(HttpServletRequest request, HttpServletResponse response) throws Exception;
    }

    static abstract class AbstractInterceptor implements Interceptor {
        private Interceptor next;

        void setNext(Interceptor interceptor) {
            next = interceptor;
        }

        @Override
        public void doNext(HttpServletRequest request, HttpServletResponse response) throws Exception {
            // Handle our part
            execute(request, response);

            // Provide further
            if (next != null) {
                next.doNext(request, response);
            }
        }

        abstract void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;

    }

    private static AbstractInterceptor buildChain(AbstractInterceptor... interceptors) {
        AbstractInterceptor current = null;
        for (AbstractInterceptor interceptor : interceptors) {
            if (current != null) {
                current.setNext(interceptor);
            }
            current = interceptor;
        }

        return interceptors[0];
    }

    public static void main(String[] args) throws Exception {
        buildChain(
                new LogInterceptor(),
                new LoginInterceptor(),
                new DetectRequestInterceptor()
        ).doNext(null, null);
    }

    static class LogInterceptor extends AbstractInterceptor {
        @Override
        void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("> logging");
        }
    }

    static class LoginInterceptor extends AbstractInterceptor {
        @Override
        void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("> check login");
        }
    }

    static class DetectRequestInterceptor extends AbstractInterceptor {
        @Override
        void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("> detect command");
        }
    }
}
