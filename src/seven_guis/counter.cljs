(ns seven-guis.counter
  (:require [reagent.core :as r]))

(defonce counter-state (r/atom 0))

(defn app []
      [:div
       [:h1 "1. Counter"]
       [:input {:type :number :value @counter-state}]
       [:button {:on-click #(swap! counter-state inc)} "Count"]])