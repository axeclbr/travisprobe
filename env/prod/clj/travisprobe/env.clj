(ns travisprobe.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[travisprobe started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[travisprobe has shut down successfully]=-"))
   :middleware identity})
