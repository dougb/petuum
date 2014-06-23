/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.petuum.petuum_ps;

public class TableGroupConfig {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TableGroupConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TableGroupConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        petuumJNI.delete_TableGroupConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TableGroupConfig() {
    this(petuumJNI.new_TableGroupConfig(), true);
  }

  public void setNum_total_server_threads(int value) {
    petuumJNI.TableGroupConfig_num_total_server_threads_set(swigCPtr, this, value);
  }

  public int getNum_total_server_threads() {
    return petuumJNI.TableGroupConfig_num_total_server_threads_get(swigCPtr, this);
  }

  public void setNum_tables(int value) {
    petuumJNI.TableGroupConfig_num_tables_set(swigCPtr, this, value);
  }

  public int getNum_tables() {
    return petuumJNI.TableGroupConfig_num_tables_get(swigCPtr, this);
  }

  public void setNum_total_clients(int value) {
    petuumJNI.TableGroupConfig_num_total_clients_set(swigCPtr, this, value);
  }

  public int getNum_total_clients() {
    return petuumJNI.TableGroupConfig_num_total_clients_get(swigCPtr, this);
  }

  public void setNum_total_bg_threads(int value) {
    petuumJNI.TableGroupConfig_num_total_bg_threads_set(swigCPtr, this, value);
  }

  public int getNum_total_bg_threads() {
    return petuumJNI.TableGroupConfig_num_total_bg_threads_get(swigCPtr, this);
  }

  public void setNum_local_server_threads(int value) {
    petuumJNI.TableGroupConfig_num_local_server_threads_set(swigCPtr, this, value);
  }

  public int getNum_local_server_threads() {
    return petuumJNI.TableGroupConfig_num_local_server_threads_get(swigCPtr, this);
  }

  public void setNum_local_app_threads(int value) {
    petuumJNI.TableGroupConfig_num_local_app_threads_set(swigCPtr, this, value);
  }

  public int getNum_local_app_threads() {
    return petuumJNI.TableGroupConfig_num_local_app_threads_get(swigCPtr, this);
  }

  public void setNum_local_bg_threads(int value) {
    petuumJNI.TableGroupConfig_num_local_bg_threads_set(swigCPtr, this, value);
  }

  public int getNum_local_bg_threads() {
    return petuumJNI.TableGroupConfig_num_local_bg_threads_get(swigCPtr, this);
  }

  public void setServer_ids(VectorInt32 value) {
    petuumJNI.TableGroupConfig_server_ids_set(swigCPtr, this, VectorInt32.getCPtr(value), value);
  }

  public VectorInt32 getServer_ids() {
    long cPtr = petuumJNI.TableGroupConfig_server_ids_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VectorInt32(cPtr, false);
  }

  public void setHost_map(MapInt32HostInfo value) {
    petuumJNI.TableGroupConfig_host_map_set(swigCPtr, this, MapInt32HostInfo.getCPtr(value), value);
  }

  public MapInt32HostInfo getHost_map() {
    long cPtr = petuumJNI.TableGroupConfig_host_map_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MapInt32HostInfo(cPtr, false);
  }

  public void setClient_id(int value) {
    petuumJNI.TableGroupConfig_client_id_set(swigCPtr, this, value);
  }

  public int getClient_id() {
    return petuumJNI.TableGroupConfig_client_id_get(swigCPtr, this);
  }

  public void setAggressive_clock(boolean value) {
    petuumJNI.TableGroupConfig_aggressive_clock_set(swigCPtr, this, value);
  }

  public boolean getAggressive_clock() {
    return petuumJNI.TableGroupConfig_aggressive_clock_get(swigCPtr, this);
  }

  public void setConsistency_model(ConsistencyModel value) {
    petuumJNI.TableGroupConfig_consistency_model_set(swigCPtr, this, value.swigValue());
  }

  public ConsistencyModel getConsistency_model() {
    return ConsistencyModel.swigToEnum(petuumJNI.TableGroupConfig_consistency_model_get(swigCPtr, this));
  }

  public void setAggressive_cpu(int value) {
    petuumJNI.TableGroupConfig_aggressive_cpu_set(swigCPtr, this, value);
  }

  public int getAggressive_cpu() {
    return petuumJNI.TableGroupConfig_aggressive_cpu_get(swigCPtr, this);
  }

  public void setServer_ring_size(int value) {
    petuumJNI.TableGroupConfig_server_ring_size_set(swigCPtr, this, value);
  }

  public int getServer_ring_size() {
    return petuumJNI.TableGroupConfig_server_ring_size_get(swigCPtr, this);
  }

}
