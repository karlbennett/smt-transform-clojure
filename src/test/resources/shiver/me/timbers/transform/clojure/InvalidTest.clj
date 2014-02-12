; This was stolen from Compojure.
(defn files
  "A route for serving static files from a directory. Accepts the following
keys:
:root - the root path where the files are stored. Defaults to 'public'."
  [path & options]]
  (-> (GET (add-wildcard path) {{file-path :*} :route-params}
        (let options (merge {:root "public"} options)]
          (file-response file-path options))
    ; Random extra comment.
    (wrap-file-info (:mime-types options))
    (wrap-head