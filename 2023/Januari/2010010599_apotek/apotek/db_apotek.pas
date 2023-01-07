unit db_apotek;

interface

uses
  System.SysUtils, System.Classes, Data.DB, ZAbstractRODataset,
  ZAbstractDataset, ZDataset, ZAbstractConnection, ZConnection;

type
  TMyDataModule = class(TDataModule)
    db_apotek: TZConnection;
    get_jadwal_: TZQuery;
    source_apotek: TDataSource;
    get_jadwal_id_apotek: TWideStringField;
    get_jadwal_nama_obat: TWideStringField;
    get_jadwal_harga: TLargeintField;
    get_jadwal_qty: TIntegerField;
    get_jadwal_tgl_produksi: TDateField;
    get_jadwal_indikasi: TWideStringField;
    get_jadwal_jenis: TWideStringField;
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  MyDataModule: TMyDataModule;

implementation

{%CLASSGROUP 'Vcl.Controls.TControl'}

{$R *.dfm}

end.
