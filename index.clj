{:namespaces
 ({:source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient/clj-orient.core-api.html",
   :name "clj-orient.core",
   :author "Eduardo Julián <eduardoejp@gmail.com>",
   :doc
   "This namespace wraps the basic OrientDB API functionality and all the DocumentDB functionality."}
  {:source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient/clj-orient.graph-api.html",
   :name "clj-orient.graph",
   :author "Eduardo Julian <eduardoejp@gmail.com>",
   :doc "This namespace wraps the GraphDB part of OrientDB."}
  {:source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/object.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient/clj-orient.object-api.html",
   :name "clj-orient.object",
   :author "Eduardo Julián <eduardoejp@gmail.com>",
   :doc "This namespace wraps the ObjectDB part of OrientDB."}
  {:source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient/clj-orient.query-api.html",
   :name "clj-orient.query",
   :author "Eduardo Julian <eduardoejp@gmail.com>",
   :doc
   "This namespace wraps the querying functionality, both for native queries and SQL queries."}
  {:source-url
   "http://github.com/eduardoejp/clj-orient/blob/580dfcc97e07e6e60c5b31c370aaa568fb04accf/src/clj_orient/schema.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient/clj-orient.schema-api.html",
   :name "clj-orient.schema",
   :author "Eduardo Julian <eduardoejp@gmail.com>",
   :doc "Functions & macros for easier schema definition."}
  {:source-url
   "http://github.com/eduardoejp/clj-orient/blob/580dfcc97e07e6e60c5b31c370aaa568fb04accf/src/clj_orient/script.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient/clj-orient.script-api.html",
   :name "clj-orient.script",
   :author "Eduardo Julián <eduardoejp@gmail.com>",
   :doc "OrientDB scripting."}),
 :vars
 ({:name "*db*",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L122",
   :dynamic true,
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/*db*",
   :doc "This dynamic var holds the current open DB.",
   :var-type "var",
   :line 122,
   :file "src/clj_orient/core.clj"}
  {:arglists ([orb]),
   :name "->bytes",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L496",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/->bytes",
   :doc
   "Returns a byte array with the bytes from the ORecordBytes object.",
   :var-type "function",
   :line 496,
   :file "src/clj_orient/core.clj"}
  {:arglists ([orb out-stream] [orb]),
   :name "->output-stream",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L490",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/->output-stream",
   :doc
   "Writes an ORecordBytes object to the given output stream.\nIf no output stream is passed, a java.io.ByteArrayOutputStream will be created, written-to and returned.",
   :var-type "function",
   :line 490,
   :file "src/clj_orient/core.clj"}
  {:arglists ([hook]),
   :name "add-hook!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L455",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/add-hook!",
   :doc "",
   :var-type "function",
   :line 455,
   :file "src/clj_orient/core.clj"}
  {:arglists ([kclass]),
   :name "browse-class",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L162",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/browse-class",
   :doc "Returns a seq of all the documents of the specified class.",
   :var-type "function",
   :line 162,
   :file "src/clj_orient/core.clj"}
  {:arglists ([kcluster]),
   :name "browse-cluster",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L164",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/browse-cluster",
   :doc "Returns a seq of all the documents in the specified cluster.",
   :var-type "function",
   :line 164,
   :file "src/clj_orient/core.clj"}
  {:arglists ([klass]),
   :name "class-cluster-ids",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L362",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/class-cluster-ids",
   :doc "",
   :var-type "function",
   :line 362,
   :file "src/clj_orient/core.clj"}
  {:arglists ([klass]),
   :name "class-indexes",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L361",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/class-indexes",
   :doc "",
   :var-type "function",
   :line 361,
   :file "src/clj_orient/core.clj"}
  {:arglists ([odoc]),
   :name "class-name",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L391",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/class-name",
   :doc "Returns the classname (as a keyword) from an OClass.",
   :var-type "function",
   :line 391,
   :file "src/clj_orient/core.clj"}
  {:arglists ([] [db]),
   :name "close-db!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L143",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/close-db!",
   :doc "Closes the DB at *db* and sets *db* to nil.",
   :var-type "function",
   :line 143,
   :file "src/clj_orient/core.clj"}
  {:arglists ([kname]),
   :name "cluster-id",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L172",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/cluster-id",
   :doc "",
   :var-type "function",
   :line 172,
   :file "src/clj_orient/core.clj"}
  {:arglists ([id]),
   :name "cluster-name",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L171",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/cluster-name",
   :doc "",
   :var-type "function",
   :line 171,
   :file "src/clj_orient/core.clj"}
  {:arglists ([]),
   :name "cluster-names",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L170",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/cluster-names",
   :doc "",
   :var-type "function",
   :line 170,
   :file "src/clj_orient/core.clj"}
  {:arglists ([orid]),
   :name "cluster-pos",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L231",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/cluster-pos",
   :doc "Given an ORID, returns the Cluster Position",
   :var-type "function",
   :line 231,
   :file "src/clj_orient/core.clj"}
  {:arglists ([clname]),
   :name "cluster-type",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L173",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/cluster-type",
   :doc "",
   :var-type "function",
   :line 173,
   :file "src/clj_orient/core.clj"}
  {:arglists ([kclass]),
   :name "count-class",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L167",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/count-class",
   :doc "",
   :var-type "function",
   :line 167,
   :file "src/clj_orient/core.clj"}
  {:arglists ([id]),
   :name "count-cluster",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L168",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/count-cluster",
   :doc "",
   :var-type "function",
   :line 168,
   :file "src/clj_orient/core.clj"}
  {:arglists
   ([kclass] [kclass ksuperclass-or-props] [kclass ksuperclass props]),
   :name "create-class!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L408",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/create-class!",
   :doc
   "Creates a class in the given database and makes it inherit the given superclass.",
   :var-type "function",
   :line 408,
   :file "src/clj_orient/core.clj"}
  {:arglists ([db-location] [db-location user password]),
   :name "create-db!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L127",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/create-db!",
   :doc
   "Creates a new database either locally or remotely. It does not, however, return the open instance or bind *db*.",
   :var-type "function",
   :line 127,
   :file "src/clj_orient/core.clj"}
  {:arglists ([klass pname ptype] [klass pname ptype conf]),
   :name "create-prop!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L332",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/create-prop!",
   :doc
   "When providing a type, it must be one of the following keywords:\n  #{:boolean :byte :short :integer :long :float :double :decimal :string\n    :date :datetime :binary :custom :transient\n    :embedded :embedded-list :embedded-map :embedded-set\n    :link :link-list :link-map :link-set}\nWhen using linked types #{:embedded, :link}, provide a vector of [link-type type]\n\nWhen providing a configuration hash-map, it must be in the format specified for update-prop!.",
   :var-type "function",
   :line 332,
   :file "src/clj_orient/core.clj"}
  {:arglists ([] [db]),
   :name "db-closed?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L175",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/db-closed?",
   :doc "",
   :var-type "function",
   :line 175,
   :file "src/clj_orient/core.clj"}
  {:arglists ([] [db]),
   :name "db-exists?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L183",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/db-exists?",
   :doc "",
   :var-type "function",
   :line 183,
   :file "src/clj_orient/core.clj"}
  {:arglists ([] [db]),
   :name "db-info",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L189",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/db-info",
   :doc "Returns information relevant to the DB as a hash-map.",
   :var-type "function",
   :line 189,
   :file "src/clj_orient/core.clj"}
  {:arglists ([] [db]),
   :name "db-open?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L180",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/db-open?",
   :doc "",
   :var-type "function",
   :line 180,
   :file "src/clj_orient/core.clj"}
  {:arglists ([sym & triggers]),
   :name "defhook",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L458",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/defhook",
   :doc
   "Creates a new hook from the following fn definitions (each one is optional):\n  (before-create [~document] ~@body)\n  (before-read [~document] ~@body)\n  (before-update [~document] ~@body)\n  (before-delete [~document] ~@body)\n  (after-create [~document] ~@body)\n  (after-read [~document] ~@body)\n  (after-update [~document] ~@body)\n  (after-delete [~document] ~@body)\nExample:\n(defhook log-hook \"Optional doc-string.\"\n  (after-create [x] (println \"Created:\" x)))\n\nNotes: defhook only creates the hook. To add it to the current *db* use add-hook.\n       All passed records are first wrapped inside a CljODoc object for convenience.",
   :var-type "macro",
   :line 458,
   :file "src/clj_orient/core.clj"}
  {:arglists ([x]),
   :name "delete!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L242",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/delete!",
   :doc
   "Deletes a document if it is passed or if its id (as ORID or vector) is passed.\nCan also remove a class from the DB Schema.",
   :var-type "function",
   :line 242,
   :file "src/clj_orient/core.clj"}
  {:arglists ([] [db]),
   :name "delete-db!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L148",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/delete-db!",
   :doc "Deletes the database bound to *db* and sets *db* to nil.",
   :var-type "function",
   :line 148,
   :file "src/clj_orient/core.clj"}
  {:arglists ([ksubclass ksuperclass]),
   :name "derive!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L397",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/derive!",
   :doc "Derives a class from another in the schema.",
   :var-type "function",
   :line 397,
   :file "src/clj_orient/core.clj"}
  {:arglists ([kclass] [kclass properties]),
   :name "document",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L211",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/document",
   :doc
   "Returns a newly created document given the document's class (as a keyword).\nIt can optionally take a Clojure hash-map to set the document's properties.",
   :var-type "function",
   :line 211,
   :file "src/clj_orient/core.clj"}
  {:arglists ([x]),
   :name "document?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L207",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/document?",
   :doc "",
   :var-type "function",
   :line 207,
   :file "src/clj_orient/core.clj"}
  {:arglists ([kclass kname]),
   :name "drop-prop!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L366",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/drop-prop!",
   :doc "Removes a property from an OClass.",
   :var-type "function",
   :line 366,
   :file "src/clj_orient/core.clj"}
  {:arglists ([kclass]),
   :name "exists-class?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L427",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/exists-class?",
   :doc "",
   :var-type "function",
   :line 427,
   :file "src/clj_orient/core.clj"}
  {:arglists ([klass prop]),
   :name "exists-prop?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L364",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/exists-prop?",
   :doc "",
   :var-type "function",
   :line 364,
   :file "src/clj_orient/core.clj"}
  {:arglists ([prop klass]),
   :name "get-prop",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L304",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/get-prop",
   :doc "",
   :var-type "function",
   :line 304,
   :file "src/clj_orient/core.clj"}
  {:arglists ([]),
   :name "hooks",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L454",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/hooks",
   :doc "",
   :var-type "function",
   :line 454,
   :file "src/clj_orient/core.clj"}
  {:arglists ([klass props]),
   :name "indexed?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L372",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/indexed?",
   :doc
   "Tests whether the given props are indexed for the given oclass.",
   :var-type "function",
   :line 372,
   :file "src/clj_orient/core.clj"}
  {:arglists ([orid]),
   :name "load",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L234",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/load",
   :doc
   "Returns a document (wrapped by CljODoc), given it's id (either as ORID or a vector (either [cluster-id item-id] or [:cluster item-id]))",
   :var-type "function",
   :line 234,
   :file "src/clj_orient/core.clj"}
  {:arglists ([kclass]),
   :name "oclass",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L383",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/oclass",
   :doc
   "Returns an OClass given the classname as a keyword.\nIf given an OClass, returns it inmediately.",
   :var-type "function",
   :line 383,
   :file "src/clj_orient/core.clj"}
  {:arglists ([x]),
   :name "oclass?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L209",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/oclass?",
   :doc "",
   :var-type "function",
   :line 209,
   :file "src/clj_orient/core.clj"}
  {:arglists ([]),
   :name "oclasses",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L394",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/oclasses",
   :doc "Returns a seq of all the OClass objects in the schema.",
   :var-type "function",
   :line 394,
   :file "src/clj_orient/core.clj"}
  {:arglists ([db-loc user pass]),
   :name "open-document-db!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L140",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/open-document-db!",
   :doc "Opens and returns a new ODatabaseDocumentTx.",
   :var-type "function",
   :line 140,
   :file "src/clj_orient/core.clj"}
  {:arglists ([ridvec]),
   :name "orid",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L225",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/orid",
   :doc "Transforms a vector into an ORecordId object.",
   :var-type "function",
   :line 225,
   :file "src/clj_orient/core.clj"}
  {:arglists ([orid]),
   :name "orid->vec",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L228",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/orid->vec",
   :doc
   "Given an ORID, returns a vector [cluster-id, cluster-position].",
   :var-type "function",
   :line 228,
   :file "src/clj_orient/core.clj"}
  {:arglists ([x]),
   :name "orid?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L208",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/orid?",
   :doc "",
   :var-type "function",
   :line 208,
   :file "src/clj_orient/core.clj"}
  {:arglists ([klass prop]),
   :name "prop-info",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L350",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/prop-info",
   :doc
   "Returns a hash-map with detailed information about a class' property.",
   :var-type "function",
   :line 350,
   :file "src/clj_orient/core.clj"}
  {:arglists ([klass]),
   :name "props",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L349",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/props",
   :doc "",
   :var-type "function",
   :line 349,
   :file "src/clj_orient/core.clj"}
  {:arglists ([source]),
   :name "record-bytes",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L482",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/record-bytes",
   :doc
   "For creating ORecordBytes objects. The source can be either a byte array or an input stream.\nTo get the data out, use ->output-stream.",
   :var-type "function",
   :line 482,
   :file "src/clj_orient/core.clj"}
  {:arglists ([hook]),
   :name "remove-hook!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L456",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/remove-hook!",
   :doc "",
   :var-type "function",
   :line 456,
   :file "src/clj_orient/core.clj"}
  {:arglists ([item] [document kcluster]),
   :name "save!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L217",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/save!",
   :doc
   "Saves a document, an OClass or an object (for the Object Database).",
   :var-type "function",
   :line 217,
   :file "src/clj_orient/core.clj"}
  {:arglists ([]),
   :name "save-schema!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L381",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/save-schema!",
   :doc "",
   :var-type "function",
   :line 381,
   :file "src/clj_orient/core.clj"}
  {:arglists ([]),
   :name "schema",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L378",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/schema",
   :doc "Returns *db*'s OSchema.",
   :var-type "function",
   :line 378,
   :file "src/clj_orient/core.clj"}
  {:arglists ([]),
   :name "schema-info",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L439",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/schema-info",
   :doc "",
   :var-type "function",
   :line 439,
   :file "src/clj_orient/core.clj"}
  {:arglists ([db]),
   :name "set-db!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L134",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/set-db!",
   :doc "Sets *db*'s root binding to the given DB.",
   :var-type "function",
   :line 134,
   :file "src/clj_orient/core.clj"}
  {:arglists ([kclass]),
   :name "sub-classes",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L405",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/sub-classes",
   :doc
   "Returns a set of the names (as keywords) of subclasses for the given oclass.",
   :var-type "function",
   :line 405,
   :file "src/clj_orient/core.clj"}
  {:arglists ([ksubclass ksuperclass]),
   :name "subclass?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L435",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/subclass?",
   :doc "",
   :var-type "function",
   :line 435,
   :file "src/clj_orient/core.clj"}
  {:arglists ([ksuperclass ksubclass]),
   :name "superclass?",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L429",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/superclass?",
   :doc "",
   :var-type "function",
   :line 429,
   :file "src/clj_orient/core.clj"}
  {:arglists ([kclass]),
   :name "truncate-class!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L437",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/truncate-class!",
   :doc "",
   :var-type "function",
   :line 437,
   :file "src/clj_orient/core.clj"}
  {:arglists ([d]),
   :name "undo!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L253",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/undo!",
   :doc "Undoes local changes to documents.",
   :var-type "function",
   :line 253,
   :file "src/clj_orient/core.clj"}
  {:arglists
   ([oprop
     {:keys [name type regex min max mandatory? nullable? index]}]
    [klass prop conf]),
   :name "update-prop!",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L306",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/update-prop!",
   :doc
   "Updates an OProperty object.\n\nPlease note:\n  type must be one of the following keywords:\n    #{:boolean :byte :short :integer :long :float :double :decimal :string\n      :date :datetime :binary :custom :transient\n      :embedded :embedded-list :embedded-map :embedded-set\n      :link :link-list :link-map :link-set}\n  index must be one of the following keywords: #{:dictionary, :fulltext, :unique, :not-unique, :proxy}\n  If passed a 'false' value for index, the index is dropped.",
   :var-type "function",
   :line 306,
   :file "src/clj_orient/core.clj"}
  {:arglists ([db & forms]),
   :name "with-db",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L154",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/with-db",
   :doc
   "Evaluates the given forms in an environment where *db* is bound to the given database.",
   :var-type "macro",
   :line 154,
   :file "src/clj_orient/core.clj"}
  {:arglists ([& forms]),
   :name "with-tx",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L195",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/with-tx",
   :doc
   "Runs the following forms inside a transaction.\nIf an exception arrises, the transaction will fail inmediately and do an automatic rollback.\nThe exception will be rethrown so the programmer can catch it.",
   :var-type "macro",
   :line 195,
   :file "src/clj_orient/core.clj"}
  {:arglists ([odoc]),
   :name "wrap-odoc",
   :namespace "clj-orient.core",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj#L91",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/51bda60b807f333fb393b531cdeac613b7fa4721/src/clj_orient/core.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.core-api.html#clj-orient.core/wrap-odoc",
   :doc "Wraps an ODocument object inside a CljODoc object.",
   :var-type "function",
   :line 91,
   :file "src/clj_orient/core.clj"}
  {:arglists ([root-name vertex]),
   :name "add-root!",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L67",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/add-root!",
   :doc "Sets up a root node with the given name (as a keyword).",
   :var-type "function",
   :line 67,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([] [polymorphic?]),
   :name "browse-edges",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L31",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/browse-edges",
   :doc "",
   :var-type "function",
   :line 31,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([kclass] [kclass polymorphic?]),
   :name "browse-elements",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L34",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/browse-elements",
   :doc "",
   :var-type "function",
   :line 34,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([] [polymorphic?]),
   :name "browse-vertices",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L28",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/browse-vertices",
   :doc "",
   :var-type "function",
   :line 28,
   :file "src/clj_orient/graph.clj"}
  {:arglists
   ([]
    [vertex]
    [vertex dir]
    [vertex dir kclass]
    [vertex dir kclass props]),
   :name "count-edges",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L39",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/count-edges",
   :doc
   "Counts either all the edges in the DB or the edges of a vertex.",
   :var-type "function",
   :line 39,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([]),
   :name "count-elements",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L45",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/count-elements",
   :doc "",
   :var-type "function",
   :line 45,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([]),
   :name "count-vertices",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L38",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/count-vertices",
   :doc "",
   :var-type "function",
   :line 38,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([kclass] [kclass ksuperclass]),
   :name "create-edge-type!",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L75",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/create-edge-type!",
   :doc "",
   :var-type "function",
   :line 75,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([kclass] [kclass ksuperclass]),
   :name "create-vertex-type!",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L50",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/create-vertex-type!",
   :doc "",
   :var-type "function",
   :line 50,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([edge]),
   :name "delete-edge!",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L88",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/delete-edge!",
   :doc "",
   :var-type "function",
   :line 88,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([vertex]),
   :name "delete-vertex!",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L62",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/delete-vertex!",
   :doc "",
   :var-type "function",
   :line 62,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([]),
   :name "edge-base-class",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L73",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/edge-base-class",
   :doc "",
   :var-type "function",
   :line 73,
   :file "src/clj_orient/graph.clj"}
  {:arglists
   ([vertex dir]
    [vertex dir kclass-or-props]
    [vertex dir kclass props]),
   :name "get-edges",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L117",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/get-edges",
   :doc
   "Gets the :in edges, the :out edges or :both edges from a vertex.\nIf provided properties to filter the edges, the properties can be a vector or a sequence (to filter edges that have the keys in there)\nor a hash-map (to filter edges with properties set to specified values).",
   :var-type "function",
   :line 117,
   :file "src/clj_orient/graph.clj"}
  {:arglists
   ([vertex dir] [vertex dir kclass-or-hmap] [vertex dir kclass hmap]),
   :name "get-ends",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L137",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/get-ends",
   :doc
   "Gets the vertices at the end of the :in edges, the :out edges or :both edges from a vertex.",
   :var-type "function",
   :line 137,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([v1 v2] [v1 v2 labels] [v1 v2 labels edge-types]),
   :name "get-links",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L90",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/get-links",
   :doc "Returns the set of edges between 2 vertices.",
   :var-type "function",
   :line 90,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([root-name]),
   :name "get-root",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L64",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/get-root",
   :doc "Returns the root node of the given name (as a keyword).",
   :var-type "function",
   :line 64,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([edge dir]),
   :name "get-vertex",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L111",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/get-vertex",
   :doc "Gets the :in or the :out vertex of an edge.",
   :var-type "function",
   :line 111,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([v1 v2] [v1 edge-data v2] [v1 edge-type props v2]),
   :name "link!",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L79",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/link!",
   :doc
   "Creates an edge between 2 vertices. An optional edge-type (as a :keyword) or hash-map can be passed to set the type and properties.",
   :var-type "function",
   :line 79,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([v1 v2] [v1 v2 labels] [v1 v2 labels edge-types]),
   :name "linked?",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L99",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/linked?",
   :doc "Returns whether 2 vertexes are linked.",
   :var-type "function",
   :line 99,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([db-loc user pass]),
   :name "open-graph-db!",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L25",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/open-graph-db!",
   :doc "Opens and returns a new OGraphDatabase.",
   :var-type "function",
   :line 25,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([v1 v2] [v1 v2 labels] [v1 v2 labels edge-types]),
   :name "unlink!",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L106",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/unlink!",
   :doc "Removes all the edges between 2 vertices",
   :var-type "function",
   :line 106,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([] [kclass-or-map] [kclass hmap]),
   :name "vertex",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L54",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/vertex",
   :doc "Creates a new vertex. Works just like 'document'.",
   :var-type "function",
   :line 54,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([]),
   :name "vertex-base-class",
   :namespace "clj-orient.graph",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj#L48",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/e1573a6885a64e94896ebabd1a4f41e12cbaa214/src/clj_orient/graph.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.graph-api.html#clj-orient.graph/vertex-base-class",
   :doc "",
   :var-type "function",
   :line 48,
   :file "src/clj_orient/graph.clj"}
  {:arglists ([kclass fn-kvs]),
   :name "->native-query",
   :namespace "clj-orient.query",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj#L53",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.query-api.html#clj-orient.query/->native-query",
   :doc
   "Takes either a function or a hash-map and returns an ONativeSynchQuery object.\n\nWhen provided a filtering function, you will have to make your own query using the available Java methods\nfor the OQueryContextNativeSchema instance you will be given.\n\nWhen provided a hash-map, matching will be done like this:\n{:field1 val1\n :field2 [<command> val2]}\n\ne.g.\n{:country \"USA\",\n :age [:$>= 20]\n :last-name [:$not= \"Smith\"]}\n\nAvailable operators:\n:$=, :$not=, :$<, :$<=, :$>, :$>=, :$like, :$matches\n\nWhen not provided a command, it works like :$= (.eq).",
   :var-type "function",
   :line 53,
   :file "src/clj_orient/query.clj"}
  {:arglists ([query-map args]),
   :name "clj-command!",
   :namespace "clj-orient.query",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj#L368",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.query-api.html#clj-orient.query/clj-command!",
   :doc
   "Runs a SQL command against the database written as a Clojure map.",
   :var-type "function",
   :line 368,
   :file "src/clj_orient/query.clj"}
  {:arglists ([query-map args]),
   :name "clj-query",
   :namespace "clj-orient.query",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj#L362",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.query-api.html#clj-orient.query/clj-query",
   :doc
   "Does a SQL query against the database written as a Clojure map.",
   :var-type "function",
   :line 362,
   :file "src/clj_orient/query.clj"}
  {:arglists ([query-map args]),
   :name "clj-query*",
   :namespace "clj-orient.query",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj#L365",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.query-api.html#clj-orient.query/clj-query*",
   :doc
   "Same as clj-query, but transforms the map into a SQL string at compile time.",
   :var-type "macro",
   :line 365,
   :file "src/clj_orient/query.clj"}
  {:arglists ([sym args & body]),
   :name "defsqlfn",
   :namespace "clj-orient.query",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj#L152",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.query-api.html#clj-orient.query/defsqlfn",
   :doc
   "Defines a new SQL function and installs it on the SQL engine.\nBesides the arguments passed to the function, it will also receive the hidden params *document* and *requester*,\nof types ODocument and OCommandExecutor respectively.\n\nIf the function does not access within it's body the hidden params *document* and *requester*, a local (Clojure) version of the\nfunction will also be defined.",
   :var-type "macro",
   :line 152,
   :file "src/clj_orient/query.clj"}
  {:arglists ([]),
   :name "install-sql-fns!",
   :namespace "clj-orient.query",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj#L118",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.query-api.html#clj-orient.query/install-sql-fns!",
   :doc
   "Installs the previously defined SQL functions in the database.",
   :var-type "function",
   :line 118,
   :file "src/clj_orient/query.clj"}
  {:arglists ([klass query]),
   :name "native-query",
   :namespace "clj-orient.query",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj#L82",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.query-api.html#clj-orient.query/native-query",
   :doc
   "Executes a native query that filters results by the class of the documents (as a keyword) and a filtering function.\nIt takes either an ONativeSynchQuery object, a function or a hash-map.\nReturns results as a lazy-seq of CljODoc objects.",
   :var-type "function",
   :line 82,
   :file "src/clj_orient/query.clj"}
  {:arglists ([comm]),
   :name "sql-command!",
   :namespace "clj-orient.query",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj#L149",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.query-api.html#clj-orient.query/sql-command!",
   :doc "Runs the given SQL command.",
   :var-type "function",
   :line 149,
   :file "src/clj_orient/query.clj"}
  {:arglists ([qry & [args paginate?]]),
   :name "sql-query",
   :namespace "clj-orient.query",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj#L138",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.query-api.html#clj-orient.query/sql-query",
   :doc
   "Runs the given SQL query with the given parameters (as a Clojure vector or hash-map) and the option to paginate results.\nWhen using positional parameters (?), use a vector.\nWhen using named parameters (:named), use a hash-map.",
   :var-type "function",
   :line 138,
   :file "src/clj_orient/query.clj"}
  {:arglists ([fields target pred & [limit]]),
   :name "traverse",
   :namespace "clj-orient.query",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj#L99",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/6b58f049700b6b611e438713d2664005af91349f/src/clj_orient/query.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.query-api.html#clj-orient.query/traverse",
   :doc
   "fields = vector of keywords.\ntarget = oclass keyword or ORID.\npred = function that takes a CljODoc and a function that takes a keyword for accessing context variables.\n(optional) limit = an integer.\n\nReturns results as a lazy-seq of CljODoc objects.",
   :var-type "function",
   :line 99,
   :file "src/clj_orient/query.clj"}
  {:arglists ([sym & triplets]),
   :name "defoclass",
   :namespace "clj-orient.schema",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/580dfcc97e07e6e60c5b31c370aaa568fb04accf/src/clj_orient/schema.clj#L43",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/580dfcc97e07e6e60c5b31c370aaa568fb04accf/src/clj_orient/schema.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.schema-api.html#clj-orient.schema/defoclass",
   :doc
   "Defines a class (and it's properties) in the database schema.",
   :var-type "macro",
   :line 43,
   :file "src/clj_orient/schema.clj"}
  {:arglists ([]),
   :name "install-oclasses!",
   :namespace "clj-orient.schema",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/580dfcc97e07e6e60c5b31c370aaa568fb04accf/src/clj_orient/schema.clj#L38",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/580dfcc97e07e6e60c5b31c370aaa568fb04accf/src/clj_orient/schema.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.schema-api.html#clj-orient.schema/install-oclasses!",
   :doc "Installs the OClasses previously defined by defoclass.",
   :var-type "function",
   :line 38,
   :file "src/clj_orient/schema.clj"}
  {:arglists ([type script] [script]),
   :name "run-script!",
   :namespace "clj-orient.script",
   :source-url
   "http://github.com/eduardoejp/clj-orient/blob/580dfcc97e07e6e60c5b31c370aaa568fb04accf/src/clj_orient/script.clj#L19",
   :raw-source-url
   "http://github.com/eduardoejp/clj-orient/raw/580dfcc97e07e6e60c5b31c370aaa568fb04accf/src/clj_orient/script.clj",
   :wiki-url
   "http://eduardoejp.github.com/clj-orient//clj-orient.script-api.html#clj-orient.script/run-script!",
   :doc
   "Executes the given script on the current *db.*\nIf no type is provided, it defaults to \"Javascript\".",
   :var-type "function",
   :line 19,
   :file "src/clj_orient/script.clj"})}
