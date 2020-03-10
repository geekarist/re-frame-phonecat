(ns ^:figwheel-no-load angular-phonecat-re-frame.dev
  (:require
    [angular-phonecat-re-frame.core :as core]
    [devtools.core :as devtools]))

(extend-protocol IPrintWithWriter
  js/Symbol
  (-pr-writer [sym writer _]
    (-write writer (str "\"" (.toString sym) "\""))))

(devtools/install!)

(enable-console-print!)

(core/init!)
