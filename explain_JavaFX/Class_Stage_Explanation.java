Stage クラスについて

インポート方法
import javafx.stage.Stage;

コンストラクタ<コンストラクタ名 説明>
Stage()// 装飾されたStageの新しいインスタンスを作成します。
Stage(StageStyle style)// Stageの新しいインスタンスを作成します。

プロパティ<型 変数名 説明>
 - ReadOnlyBooleanProparty alwaysOnTop// このStageを他のウィンドウの上に保持するかどうかを定義します。
 - ObjectProperty<String> fullScreenExitHint// 全画面の終了キーの組合せのプロパティを取得します。
 - ObjectProperty<KeyCombination> fullScreenExitKey// 全画面の終了キーの組合せのプロパティを取得します。
 - ReadOnlyBooleanProperty fullScreen// このStageを全画面の装飾のないウィンドウにするかどうかを指定します。
 - ReadOnlyBooleanProperty iconified// Stageをアイコン化するかどうかを定義します。
 - DoubleProperty maxHeight// このStageの最大高さを定義します。
 - ReadOnlyBooleanProperty maximized// Stageを最大化するかどうかを定義します。
 - DoubleProperty maxWidth// このStageの最大幅を定義します。
 - DoubleProperty minHeight// このStageの最小高さを定義します。
 - DoubleProperty minWidth// このStageの最小幅を定義します。
 - BooleanProperty resizable// ユーザーがStageをサイズ変更できるかどうかを定義します。
 - StringProperty title// Stageのタイトルを定義します。

メソッド<メソッド名 返り値 説明>
 + alwaysOnTopProperty() : ReadOnlyBooleanProperty// このStageを他のウィンドウの上に保持するかどうかを定義します。
 + close() : void// このStageを閉じます。
 + fullScreenExitHintProperty()  : ObjectProperty<String>
 + fullScreenExitKeyProperty() : ObjectProperty<KeyCombination>// 全画面の終了キーの組合せのプロパティを取得します。
 + fullScreenProperty() : ReadOnlyBooleanProperty// このStageを全画面の装飾のないウィンドウにするかどうかを指定します。
 + getFullScreenExitHint() : String// プロパティfullScreenExitHintの値を取得します。
 + getFullScreenExitKeyCombination() : KeyCombination// 全画面モードを終了するために使用される現在の順序を取得します。
 + getIcons() : ObservableList<Image>// ウィンドウの装飾に使用され、最小化時に使用されるアイコン・イメージを取得します。
 + getMaxHeight() : double// プロパティmaxHeightの値を取得します。
 + getMaxWidth() : double// プロパティmaxWidthの値を取得します。
 + getMinHeight() : double// プロパティminHeightの値を取得します。
 + getMinWidth() : double// プロパティminWidthの値を取得します。
 + getModality() : Modality// このステージのモダリティ属性を取得します。
 + getOwner() : Window// このステージの所有者ウィンドウを取得するか、または所有者がいないステージの場合はnullとなります。
 + getStyle() : StageStyle// このステージのスタイル属性を取得します。
 + getTitle() : String// プロパティtitleの値を取得します。
 + iconifiedProperty() : ReadOnlyBooleanProperty// Stageをアイコン化するかどうかを定義します。
 + initModality(Modality modality) : void// このステージのモダリティを指定します。
 + initOwner(Window owner) : void// このステージの所有者ウィンドウを指定するか、または最上位で所有者のいないステージの場合はnullとなります。
 + initStyle(StageStyle style) : void// このステージのスタイルを指定します。
 + isAlwaysOnTop() : boolean// プロパティalwaysOnTopの値を取得します。
 + isFullScreen() : boolean// プロパティfullScreenの値を取得します。
 + isIconified() : boolean// プロパティiconifiedの値を取得します。
 + isMaximized() : boolean// プロパティmaximizedの値を取得します。
 + isResizable() : boolean// プロパティresizableの値を取得します。
 + maxHeightProperty() : DoubleProperty// このStageの最大高さを定義します。
 + maximizedProperty() : ReadOnlyBooleanProperty// Stageを最大化するかどうかを定義します。
 + maxWidthProperty() : DoubleProperty// このStageの最大幅を定義します。
 + minHeightProperty() : DoubleProperty// このStageの最小高さを定義します。
 + minWidthProperty() : DoubleProperty// このStageの最小幅を定義します。
 + resizableProperty() : BooleanProperty// ユーザーがStageをサイズ変更できるかどうかを定義します。
 + setAlwaysOnTop(boolean value) : void// プロパティalwaysOnTopの値を設定します。
 + setFullScreen(boolean value) : void// プロパティfullScreenの値を設定します。
 + setFullScreenExitHint(String value) : void// ユーザーが全画面モードに入った場合に表示するテキストを指定します(通常は、全画面モードを終了する方法を示すために使用される)。
 + setFullScreenExitKeyCombination(KeyCombination keyCombination) : void// ユーザーが全画面モードを終了できるKeyCombinationを指定します。
 + setIconified(boolean value) : void// プロパティiconifiedの値を設定します。
 + setMaxHeight(double value) : void// プロパティmaxHeightの値を設定します。
 + setMaximized(boolean value) : void// プロパティmaximizedの値を設定します。
 + setMaxWidth(double value) : void// プロパティmaxWidthの値を設定します。
 + setMinHeight(double value) : void// プロパティminHeightの値を設定します。
 + setMinWidth(double value) : void// プロパティminWidthの値を設定します。
 + setResizable(boolean value) : void// プロパティresizableの値を設定します。
 + setScene(Scene value) : void// このステージで使用されるシーンを指定します。
 + setTitle(String value) : void// プロパティtitleの値を設定します。
 + show() : void// 表示をtrueに設定して、このウィンドウの表示を試みます。
 + showAndWait() : void// このステージを表示し、このステージが非表示になる(閉じられる)まで待機してから呼出し元に戻ります。
 + titleProperty() : StringProperty// Stageのタイトルを定義します。
 + toBack() : void// Windowを背面に移動します。
 + toFront() : void// Windowを前面に移動します。
