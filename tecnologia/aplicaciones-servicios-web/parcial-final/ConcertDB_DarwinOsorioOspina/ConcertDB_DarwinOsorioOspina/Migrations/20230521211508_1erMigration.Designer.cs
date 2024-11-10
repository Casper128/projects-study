﻿// <auto-generated />
using System;
using ConcertDB_DarwinOsorioOspina.DAL;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

#nullable disable

namespace ConcertDB_DarwinOsorioOspina.Migrations
{
    [DbContext(typeof(BdContext))]
    [Migration("20230521211508_1erMigration")]
    partial class _1erMigration
    {
        /// <inheritdoc />
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "7.0.5")
                .HasAnnotation("Relational:MaxIdentifierLength", 128);

            SqlServerModelBuilderExtensions.UseIdentityColumns(modelBuilder);

            modelBuilder.Entity("ConcertDB_DarwinOsorioOspina.DAL.Entity.Ticket", b =>
                {
                    b.Property<Guid>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("uniqueidentifier");

                    b.Property<string>("EntranceGate")
                        .HasMaxLength(100)
                        .HasColumnType("nvarchar(100)");

                    b.Property<bool>("IsUsed")
                        .HasMaxLength(100)
                        .HasColumnType("bit");

                    b.Property<DateTime?>("UseDate")
                        .HasMaxLength(100)
                        .HasColumnType("datetime2");

                    b.HasKey("Id");

                    b.HasIndex("Id")
                        .IsUnique();

                    b.ToTable("Tickets");
                });
#pragma warning restore 612, 618
        }
    }
}
