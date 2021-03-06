(defproject muse "0.3.2"
  :description "A Clojure library that simplifies access to remote data (db, cache, http services)"
  :url "https://github.com/kachayev/muse"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"
            :distribution :repo}
  :global-vars {*warn-on-reflection* false}
  :plugins [[cider/cider-nrepl "0.8.2"]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [cats "0.4.0"]]
  :signing {:gpg-key "kachayev@gmail.com"})
