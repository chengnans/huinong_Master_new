import request from '@/utils/request'

// 查询数据同步任务列表
export function listData_synchronization(query) {
  return request({
    url: '/system/data_synchronization/list',
    method: 'get',
    params: query
  })
}

// 查询数据同步任务详细
export function getData_synchronization(id) {
  return request({
    url: '/system/data_synchronization/' + id,
    method: 'get'
  })
}

// 新增数据同步任务
export function addData_synchronization(data) {
  return request({
    url: '/system/data_synchronization',
    method: 'post',
    data: data
  })
}

// 修改数据同步任务
export function updateData_synchronization(data) {
  return request({
    url: '/system/data_synchronization',
    method: 'put',
    data: data
  })
}

// 删除数据同步任务
export function delData_synchronization(id) {
  return request({
    url: '/system/data_synchronization/' + id,
    method: 'delete'
  })
}
