(ns user
  (:require [mount.core :as mount]
            [travisprobe.figwheel :refer [start-fw stop-fw cljs]]
            travisprobe.core))

(defn start []
  (mount/start-without #'travisprobe.core/http-server
                       #'travisprobe.core/repl-server))

(defn stop []
  (mount/stop-except #'travisprobe.core/http-server
                     #'travisprobe.core/repl-server))

(defn restart []
  (stop)
  (start))


