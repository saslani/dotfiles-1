{:user {
        :plugins [
                  [cider/cider-nrepl "0.8.2"]
                  [lein-droid "0.2.4-SNAPSHOT"]]
        :repl-options
        {:init
         (do
           (set! *print-length* 100))}
        :android {:sdk-path "/usr/local/Cellar/android-sdk/23.0.2"}}
 :android-config {:android {:sdk-path "/usr/local/Cellar/android-sdk/23.0.2"}}}

                  ;; [lein-describe "0.3.0-SNAPSHOT"]
                  ;; [lein-difftest "2.0.0"]
                  ;; [lein-pprint "1.1.1"]
                  ;; [compojure/lein-template "0.3.0"]
                  ;; [lein-try "0.4.1"]
                  ;; [lein-clique "0.1.2"]
                  ;; [com.jakemccrary/lein-test-refresh "0.3.0"]
                  ;; [org.clojars.kurtharriger/lein-depgraph "0.1.0"]
