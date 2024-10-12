import request from '@/utils/request'

// 查询数据源管理列表
export function listData_source_manage(query) {
  return request({
    url: '/system/data_source_manage/list',
    method: 'get',
    params: query
  })
}

// 查询数据源管理详细
export function getData_source_manage(id) {
  return request({
    url: '/system/data_source_manage/' + id,
    method: 'get'
  })
}

// 新增数据源管理
export function addData_source_manage(data) {
  return request({
    url: '/system/data_source_manage',
    method: 'post',
    data: data
  })
}

// 修改数据源管理
export function updateData_source_manage(data) {
  return request({
    url: '/system/data_source_manage',
    method: 'put',
    data: data
  })
}

// 删除数据源管理
export function delData_source_manage(id) {
  return request({
    url: '/system/data_source_manage/' + id,
    method: 'delete'
  })
}
