(ns travisprobe.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [travisprobe.core-test]))

(doo-tests 'travisprobe.core-test)

