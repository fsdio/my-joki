program apotek;

uses
  Vcl.Forms,
  desain_apotek in 'desain_apotek.pas' {Form1},
  db_apotek in 'db_apotek.pas' {MyDataModule: TDataModule};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.CreateForm(TMyDataModule, MyDataModule);
  Application.Run;
end.
