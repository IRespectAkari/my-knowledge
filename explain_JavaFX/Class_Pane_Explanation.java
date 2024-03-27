Pane クラスの説明

コンストラクタ<コンストラクタ名 説明>
Pane()// Paneレイアウトを作成します。
Pane(Node... children)// Paneレイアウトを作成します。

プロパティ<型 変数名 説明>

メソッド<メソッド名 返り値 説明>
 + getChildren() : ObservableList<Node>// このParentの子のリストを取得します。（※ Parent クラスからコピーされた説明）


直系の既知のサブクラス
AnchorPane/* AnchorPaneは、子ノードの枠をアンカー・ペインの枠からのオフセット位置までアンカーします。*/
コンストラクタ<コンストラクタ名 説明>
AnchorPane()// AnchorPaneレイアウトを作成します。
AnchorPane(Node... children)// 子が指定されたAnchorPaneレイアウトを作成します。

BorderPane/* BorderPaneは、上、左、右、下、中央の各位置に子をレイアウトします。*/
コンストラクタ<コンストラクタ名 説明>
BorderPane()// BorderPaneレイアウトを作成します。
BorderPane(Node center)// BorderPaneの中央としてノードが指定されたBorderPaneレイアウトを作成します。
BorderPane(Node center, Node top, Node right, Node bottom, Node left)// BorderPaneの主なレイアウト領域ごとに使用するノードが指定されたBorderPaneレイアウトを作成します

DialogPane/* */
コンストラクタ<コンストラクタ名 説明>
DialogPane()// スタイル・クラス'dialog-pane'を使用して新しいDialogPaneインスタンスを作成します。

FlowPane/* */
コンストラクタ<コンストラクタ名 説明>


GridPane/* */
コンストラクタ<コンストラクタ名 説明>


HBox/* HBoxは、単一の水平行に子をレイアウトします。*/
コンストラクタ<コンストラクタ名 説明>


VBox/* 単一の垂直列に子をレイアウトします。*/
コンストラクタ<コンストラクタ名 説明>
VBox()// スペースを0、位置合せをTOP_LEFTとしてVBoxレイアウトを作成します。
VBox(double spacing)// 子間のスペースを指定してVBoxレイアウトを作成します。
VBox(double spacing, Node... children)// 子間のスペーシングを指定したVBoxレイアウトを作成します。
VBox(Node... children)// スペーシングが0のVBoxレイアウトを作成します。

PopupControl.CSSBridge/* */
コンストラクタ<コンストラクタ名 説明>

StackPane/* */
コンストラクタ<コンストラクタ名 説明>

TextFlow/* */
コンストラクタ<コンストラクタ名 説明>

TilePane/* */
コンストラクタ<コンストラクタ名 説明>
