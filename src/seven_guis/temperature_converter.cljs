(ns seven-guis.temperature-converter
  (:require [reagent.core :as r]))


(defonce converter-state 0)

;; The formula for converting a temperature C in Celsius into a temperature F in Fahrenheit is C = (F - 32) * (5/9) and the dual direction is F = C * (9/5) + 32.
;; TODO on-change/on-update
(defn app []
      [:div
       [:h1 "2. Temperature Converter"]
       [:input {:type :number}]
       [:label "Celsius = "]
       [:input {:type :number}]
       [:label "Fahrenheit"]
       ])