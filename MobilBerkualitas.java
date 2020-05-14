import java.util.Scanner;

public class MobilBerkualitas{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		char jenis, max, max1, pil, pil1, pil2, pil3, pil4, pil5, pil6, pil7, pil8;
		int bajet;
		
		
		System.out.println ("\n\t\t\tProgram Pendukung Keputusan Menentukan Mobil Second Yang Berkualitas Sesuai Bugjet");
		System.out.println ("\t\t\t==================================================================================");
		System.out.println ("\t\t\t\tProgram Ini Akan Menampilkan Daftar Merk Mobil Terbaik Untuk Anda !");
		System.out.println ("\t\t\t\t===================================================================");
		System.out.println ("\t\t\t\t   Inputkan Rentang Bugjet Yang Anda Miliki Sesuai Daftar Dibawah");
		System.out.println ("\t\t\t\t\t\t{50-100 || 101-200 || 201-300 || >300}");
		System.out.println ("\t\t\t\t\t\t======================================");
		System.out.print ("Rentang Bajet = ");
		bajet = input.nextInt();
		System.out.println ("\n\nPerbedaan Harga Akan Mempengaruhi Point Pertanyaan");
		System.out.println ("\t\t\t   Program Ini Juga Akan Mengecek Apakah Mobil Tersebut Berkualitas Atau Tidak");
		System.out.println ("\t\t\t\t\t\t\t======================");
		System.out.println ("\t\t\t\t\t\t\t||Lets Get Started !||");
		System.out.println ("\t\t\t\t\t\t\t======================");
			if (bajet>50&&bajet<=100){
					System.out.println ("Anda memilih mobil dengan rentang harga 50-100 jt");
					System.out.println ("Mari Kita Mulai Dengan Pengecekan Fisik Kendaraan");
					System.out.println ("Pengecekan ini berlaku untuk semua jenis mobil karena bersifat umum");
					System.out.println ("Inputkan hanya y/n saja");
					System.out.println ("1. Apakah ada tetesan oli saat mobil ditarik pedal gas nya ?");
					pil = input.next().charAt(0);
					System.out.println ("2. Apakah ada bekas tabrakan parah ? ");
					pil1 = input.next().charAt(0);
					System.out.println ("3. Perhatikan suara mobil apakah ada suara menderung ?");
					pil2 = input.next().charAt(0);					
					System.out.println ("4. Buka kap mesin dan periksa di sekeliling ruang mesin apakah terdapat cat yang terlihat relatif baru dibandingkan dengan yang lain ?");
					pil3 = input.next().charAt(0);					
					System.out.println ("5. Saat menginjak pedal gas perhatikan apakah spidometer naik dan turun dengan tidak stabil ?");
					pil4 = input.next().charAt(0);				
					System.out.println ("6. Perhatikan knalpot nya apakah mengeluarkan emisi buang yang berlebih ?");
					pil5 = input.next().charAt(0);					
					System.out.println ("7. Apakah tali kipas saat digoyang-goyangkan terasa tegang ?");
					pil6 = input.next().charAt(0);					
					System.out.println ("8. Perhatikan kabel busi apakah terasa tegang saat digoyang-goyangkan ?");
					pil7 = input.next().charAt(0);					
					System.out.println ("9. Apakah mobil tersebut mempunyai surat-surat lengkap seperti :");
					System.out.println ("BPKB || STNK ||Bukti pembelian sebelumnya");
					pil8 = input.next().charAt(0);
					if (pil=='y'||pil=='n'){
						if (pil1=='y'){
							if (pil2=='y'){
								if (pil3=='y'){
									if (pil4=='y'){
										if (pil5=='y'){
											if (pil6=='y'){
												if (pil7=='y'){
													if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
													}
												}
											}
										}
									}
								}
							}
							else if (pil2=='n'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
							}
						}
						else if (pil1=='n'){
								if (pil2=='y'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
									}
								}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
						}
								if (pil2=='y'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
								}
								else if (pil2=='n'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Bagus");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
										
														}
													}
												}
											}
										}
									}
								}
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
										
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}		
													}
												}
											}
										}
									}
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
										}
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
					}
			}
		if (bajet>100&&bajet<=200){
					System.out.println ("Anda memilih mobil dengan rentang harga 100-200 jt");
					System.out.println ("Mari Kita Mulai Dengan Pengecekan Fisik Kendaraan");
					System.out.println ("Pengecekan ini berlaku untuk semua jenis mobil karena bersifat umum");
					System.out.println ("Inputkan hanya y/n saja");
					System.out.println ("1. Apakah ada tetesan oli saat mobil ditarik pedal gas nya ?");
					pil = input.next().charAt(0);
					System.out.println ("2. Apakah ada bekas tabrakan parah ? ");
					pil1 = input.next().charAt(0);
					System.out.println ("3. Perhatikan suara mobil apakah ada suara menderung ?");
					pil2 = input.next().charAt(0);					
					System.out.println ("4. Perhatikan Kilometer Kendaraan Apakah Diatas 50000km ?");
					pil3 = input.next().charAt(0);					
					System.out.println ("5. Saat menginjak pedal gas perhatikan apakah spidometer naik dan turun dengan tidak stabil ?");
					pil4 = input.next().charAt(0);				
					System.out.println ("6. Periksa Interior Mobil Apakah Lengkap Seperti Kaluaran Pabrik ?");
					pil5 = input.next().charAt(0);					
					System.out.println ("7. Apakah tali kipas saat digoyang-goyangkan terasa tegang ?");
					pil6 = input.next().charAt(0);					
					System.out.println ("8. Perhatikan kabel busi apakah terasa tegang saat digoyang-goyangkan ?");
					pil7 = input.next().charAt(0);					
					System.out.println ("9. Apakah mobil tersebut mempunyai surat-surat lengkap seperti :");
					System.out.println ("BPKB || STNK ||Bukti pembelian sebelumnya");
					pil8 = input.next().charAt(0);
					if (pil=='y'||pil=='n'){
						if (pil1=='y'){
							if (pil2=='y'){
								if (pil3=='y'){
									if (pil4=='y'){
										if (pil5=='y'){
											if (pil6=='y'){
												if (pil7=='y'){
													if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
													}
												}
											}
										}
									}
								}
							}
							else if (pil2=='n'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
							}
						}
						else if (pil1=='n'){
								if (pil2=='y'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
									}
								}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
						}
								if (pil2=='y'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
								}
								else if (pil2=='n'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Bagus");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
										
														}
													}
												}
											}
										}
									}
								}
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
										
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}		
													}
												}
											}
										}
									}
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
										}
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
					}
			}
		if (bajet>200&&bajet<=300){
					System.out.println ("Anda memilih mobil dengan rentang harga 200-300 jt");
					System.out.println ("Mari Kita Mulai Dengan Pengecekan Fisik Kendaraan");
					System.out.println ("Pengecekan ini berlaku untuk semua jenis mobil karena bersifat umum");
					System.out.println ("Inputkan hanya y/n saja");
					System.out.println ("1. Apakah ada tetesan oli saat mobil ditarik pedal gas nya ?");
					pil = input.next().charAt(0);
					System.out.println ("2. Apakah ada bekas tabrakan parah ? ");
					pil1 = input.next().charAt(0);
					System.out.println ("3. Perhatikan suara mobil apakah ada suara menderung ?");
					pil2 = input.next().charAt(0);					
					System.out.println ("4. Buka kap mesin dan periksa di sekeliling ruang mesin apakah terdapat cat yang terlihat relatif baru dibandingkan dengan yang lain ?");
					pil3 = input.next().charAt(0);					
					System.out.println ("5. Saat menginjak pedal gas perhatikan apakah spidometer naik dan turun dengan tidak stabil ?");
					pil4 = input.next().charAt(0);				
					System.out.println ("6. Periksa interior mobil apakah semuanya lengkap seperti bawaan pabrik ?");
					pil5 = input.next().charAt(0);					
					System.out.println ("7. Apakah tali kipas saat digoyang-goyangkan terasa tegang ?");
					pil6 = input.next().charAt(0);					
					System.out.println ("8. Perhatikan kabel busi apakah terasa tegang saat digoyang-goyangkan ?");
					pil7 = input.next().charAt(0);					
					System.out.println ("9. Apakah mobil tersebut mempunyai surat-surat lengkap seperti :");
					System.out.println ("BPKB || STNK ||Bukti pembelian sebelumnya");
					pil8 = input.next().charAt(0);
					if (pil=='y'||pil=='n'){
						if (pil1=='y'){
							if (pil2=='y'){
								if (pil3=='y'){
									if (pil4=='y'){
										if (pil5=='y'){
											if (pil6=='y'){
												if (pil7=='y'){
													if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
													}
												}
											}
										}
									}
								}
							}
							else if (pil2=='n'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
							}
						}
						else if (pil1=='n'){
								if (pil2=='y'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
									}
								}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
						}
								if (pil2=='y'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
								}
								else if (pil2=='n'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Bagus");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
										
														}
													}
												}
											}
										}
									}
								}
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
										
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}		
													}
												}
											}
										}
									}
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
										}
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
					}
			}
		if (bajet>300){
					System.out.println ("Anda memilih mobil dengan rentang harga diatas 300 jt");
					System.out.println ("Mari Kita Mulai Dengan Pengecekan Fisik Kendaraan");
					System.out.println ("Pengecekan ini berlaku untuk semua jenis mobil karena bersifat umum");
					System.out.println ("Inputkan hanya y/n saja");
					System.out.println ("1. Apakah ada tetesan oli saat mobil ditarik pedal gas nya ?");
					pil = input.next().charAt(0);
					System.out.println ("2. Apakah ada bekas tabrakan parah ? ");
					pil1 = input.next().charAt(0);
					System.out.println ("3. Perhatikan suara mobil apakah ada suara menderung ?");
					pil2 = input.next().charAt(0);					
					System.out.println ("4. Buka kap mesin dan periksa di sekeliling ruang mesin apakah terdapat cat yang terlihat relatif baru dibandingkan dengan yang lain ?");
					pil3 = input.next().charAt(0);					
					System.out.println ("5. Saat menginjak pedal gas perhatikan apakah spidometer naik dan turun dengan tidak stabil ?");
					pil4 = input.next().charAt(0);				
					System.out.println ("6. Periksa kilometer mobil apakah diatas 20000km ?");
					pil5 = input.next().charAt(0);					
					System.out.println ("7. Apakah tali kipas saat digoyang-goyangkan terasa tegang ?");
					pil6 = input.next().charAt(0);					
					System.out.println ("8. Perhatikan kabel busi apakah terasa tegang saat digoyang-goyangkan ?");
					pil7 = input.next().charAt(0);					
					System.out.println ("9. Apakah mobil tersebut mempunyai surat-surat lengkap seperti :");
					System.out.println ("BPKB || STNK ||Bukti pembelian sebelumnya");
					pil8 = input.next().charAt(0);
					if (pil=='y'||pil=='n'){
						if (pil1=='y'){
							if (pil2=='y'){
								if (pil3=='y'){
									if (pil4=='y'){
										if (pil5=='y'){
											if (pil6=='y'){
												if (pil7=='y'){
													if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
													}
												}
											}
										}
									}
								}
							}
							else if (pil2=='n'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Berkualitas");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
							}
						}
						else if (pil1=='n'){
								if (pil2=='y'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
									}
								}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
						}
								if (pil2=='y'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
													}
												}
											}
										}
									}
								}
								else if (pil2=='n'){
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Bagus");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
										
														}
													}
												}
											}
										}
									}
								}
									if (pil3=='y'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
										
														}
													}
												}
											}
										}
									}
									else if (pil3=='n'){
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Bagus");
														}		
													}
												}
											}
										}
									}
										if (pil4=='y'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
										}
										else if (pil4=='n'){
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
										}
											if (pil5=='y'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Kurang Prima");
														}
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
											else if (pil5=='n'){
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
											}
												if (pil6=='y'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
												else if (pil6=='n'){
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
												}
													if (pil7=='y'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Cukup Baik");
														}
													}
													else if (pil7=='n'){
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}		
													}
														if (pil8=='y'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
														else if (pil8=='n'){
															System.out.println ("Mobil Dalam Kondisi Prima Dan Berkualitas");
														}
					}
			}
	}
}

