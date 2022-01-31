(ns seven-guis.temperature-converter
  (:require [reagent.core :as r]))


(defonce converter-state (r/atom 0.0))

;; F = C * (9/5) + 32.
(defn to-fahrenheit [celsius]
  (+ (* celsius (/ 9.0 5.0)) 32.0))

;; C = (F - 32) * (5/9)
(defn to-celsius [fahrenheit]
  (* (- fahrenheit 32) (/ 5.0 9.0)))

(defn app []
  [:div
   [:h1 "2. Temperature Converter"]
   [:input {:type      :number
            :value     @converter-state
            :on-change #(reset! converter-state (-> % .-target .-value))}]
   [:label "Celsius = "]
   [:input {:type      :number
            :value     (to-fahrenheit @converter-state)
            :on-change #(reset! converter-state (to-celsius (-> % .-target .-value)))}]
   [:label "Fahrenheit"]
   ])