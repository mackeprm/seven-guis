(ns seven-guis.core
  (:require [reagent.core :as r :refer [atom]]
            [reagent.dom :as rd]
            [seven-guis.counter :as counter]
            [seven-guis.temperature-converter :as temperature]))


(defn all-tasks []
      [:div.container
       [counter/app]
       [temperature/app]])

(defn start []
      (rd/render [all-tasks]
                 (. js/document (getElementById "app"))))

(defn ^:export init []
      ;; init is called ONCE when the page loads
      ;; this is called in the index.html and must be exported
      ;; so it is available even in :advanced release builds
      (start))

(defn stop []
      ;; stop is called before any code is reloaded
      ;; this is controlled by :before-load in the config
      (js/console.log "stop"))
