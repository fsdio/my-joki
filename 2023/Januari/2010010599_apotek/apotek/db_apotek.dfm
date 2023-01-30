object MyDataModule: TMyDataModule
  OldCreateOrder = False
  Height = 422
  Width = 798
  object db_apotek: TZConnection
    ControlsCodePage = cCP_UTF16
    Catalog = ''
    Properties.Strings = (
      'controls_cp=CP_UTF16')
    Connected = True
    HostName = '127.0.0.1'
    Port = 3306
    Database = '2010010599_apotek'
    User = 'root'
    Password = ''
    Protocol = 'mysql'
    LibraryLocation = 
      'F:\RAHMAT_SUNJANI\my-joki\2023\Januari\2010010599_apotek\apotek\' +
      'Win32\Debug\libmysql.dll'
    Left = 168
    Top = 136
  end
  object get_jadwal_: TZQuery
    Connection = db_apotek
    Filtered = True
    CachedUpdates = True
    Active = True
    SQL.Strings = (
      'SELECT * FROM tb_apotek;')
    Params = <>
    UpdateMode = umUpdateAll
    Left = 280
    Top = 168
    object get_jadwal_id_apotek: TWideStringField
      FieldName = 'id_apotek'
      Required = True
    end
    object get_jadwal_nama_obat: TWideStringField
      FieldName = 'nama_obat'
      Required = True
      Size = 100
    end
    object get_jadwal_harga: TLargeintField
      FieldName = 'harga'
      Required = True
    end
    object get_jadwal_qty: TIntegerField
      FieldName = 'qty'
      Required = True
    end
    object get_jadwal_tgl_produksi: TDateField
      FieldName = 'tgl_produksi'
      Required = True
    end
    object get_jadwal_indikasi: TWideStringField
      FieldName = 'indikasi'
      Required = True
      Size = 100
    end
    object get_jadwal_jenis: TWideStringField
      FieldName = 'jenis'
      Required = True
    end
  end
  object source_apotek: TDataSource
    DataSet = get_jadwal_
    Left = 384
    Top = 112
  end
end
