object Form1: TForm1
  Left = 0
  Top = 0
  Caption = 'Form1'
  ClientHeight = 529
  ClientWidth = 623
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'Tahoma'
  Font.Style = []
  OldCreateOrder = False
  Position = poDesktopCenter
  PixelsPerInch = 96
  TextHeight = 13
  object Label5: TLabel
    Left = 7
    Top = 198
    Width = 22
    Height = 13
    Caption = 'QTY'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -11
    Font.Name = 'Tahoma'
    Font.Style = [fsBold]
    ParentFont = False
  end
  object PageControl1: TPageControl
    Left = 0
    Top = 0
    Width = 623
    Height = 529
    ActivePage = RUTINITAS
    Align = alClient
    TabOrder = 0
    ExplicitLeft = 7
    ExplicitTop = 56
    ExplicitWidth = 666
    ExplicitHeight = 695
    object RUTINITAS: TTabSheet
      Caption = 'RUTINITAS'
      ImageIndex = 1
      object Label1: TLabel
        Left = 3
        Top = 24
        Width = 59
        Height = 13
        Caption = 'ID APOTEK'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'Tahoma'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label2: TLabel
        Left = 3
        Top = 64
        Width = 66
        Height = 13
        Caption = 'NAMA OBAT'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'Tahoma'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label3: TLabel
        Left = 3
        Top = 147
        Width = 22
        Height = 13
        Caption = 'QTY'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'Tahoma'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label4: TLabel
        Left = 3
        Top = 104
        Width = 40
        Height = 13
        Caption = 'HARGA'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'Tahoma'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label6: TLabel
        Left = 311
        Top = 104
        Width = 113
        Height = 13
        Caption = 'TANGGAL PRODUKSI'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'Tahoma'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label7: TLabel
        Left = 311
        Top = 24
        Width = 52
        Height = 13
        Caption = 'INDIKASI'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'Tahoma'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label8: TLabel
        Left = 311
        Top = 64
        Width = 31
        Height = 13
        Caption = 'JENIS'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'Tahoma'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object edit_idapotek: TEdit
        Left = 144
        Top = 21
        Width = 145
        Height = 21
        TabOrder = 0
        OnChange = CariDataIdApotek
      end
      object edit_nameobat: TEdit
        Left = 144
        Top = 61
        Width = 145
        Height = 21
        TabOrder = 1
        OnChange = CariDataNamaObat
      end
      object tbl_apotek: TDBGrid
        AlignWithMargins = True
        Left = 3
        Top = 218
        Width = 609
        Height = 280
        Align = alBottom
        DataSource = MyDataModule.source_apotek
        Options = [dgTitles, dgIndicator, dgColumnResize, dgColLines, dgRowLines, dgTabs, dgRowSelect, dgConfirmDelete, dgCancelOnExit, dgTitleClick, dgTitleHotTrack]
        ParentColor = True
        TabOrder = 2
        TitleFont.Charset = DEFAULT_CHARSET
        TitleFont.Color = clWindowText
        TitleFont.Height = -11
        TitleFont.Name = 'Tahoma'
        TitleFont.Style = []
        OnDblClick = tbl_apotekDblClick
      end
      object btn_refresh: TButton
        Left = 144
        Top = 187
        Width = 145
        Height = 25
        Caption = 'REFRESH'
        TabOrder = 3
        OnClick = btn_refreshClick
      end
      object btn_edit: TButton
        Left = 295
        Top = 187
        Width = 162
        Height = 25
        Caption = 'EDIT'
        TabOrder = 4
        OnClick = btn_editClick
      end
      object btn_simpan: TButton
        Left = 463
        Top = 187
        Width = 143
        Height = 25
        Caption = 'SIMPAN'
        TabOrder = 5
        OnClick = btn_simpanClick
      end
      object btn_hapus: TButton
        Left = 3
        Top = 187
        Width = 135
        Height = 25
        Caption = 'HAPUS'
        TabOrder = 6
        OnClick = btn_hapusClick
      end
      object edit_indikasi: TEdit
        Left = 463
        Top = 21
        Width = 145
        Height = 21
        TabOrder = 7
        OnChange = CariDataIndikasi
      end
      object edit_jenis: TEdit
        Left = 463
        Top = 61
        Width = 145
        Height = 21
        TabOrder = 8
        OnChange = CariDataJenis
      end
      object edit_harga: TNumberBox
        Left = 144
        Top = 101
        Width = 145
        Height = 21
        TabOrder = 9
      end
      object edit_qty: TNumberBox
        Left = 144
        Top = 144
        Width = 145
        Height = 21
        TabOrder = 10
      end
    end
  end
  object edit_tanggal: TDateTimePicker
    Left = 467
    Top = 128
    Width = 145
    Height = 21
    Date = 44929.000000000000000000
    Time = 44929.000000000000000000
    MinDate = 44929.000000000000000000
    TabOrder = 1
  end
end
