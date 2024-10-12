import request from '@/utils/request'

// 查询数据分类管理列表
export function listData_classify_manage(query) {
  return request({
    url: '/system/data_classify_manage/list',
    method: 'get',
    params: query
  })
}

// 查询数据分类管理详细
export function getData_classify_manage(id) {
  return request({
    url: '/system/data_classify_manage/' + id,
    method: 'get'
  })
}

// 新增数据分类管理
export function addData_classify_manage(data) {
  return request({
    url: '/system/data_classify_manage',
    method: 'post',
    data: data
  })
}

// 修改数据分类管理
export function updateData_classify_manage(data) {
  return request({
    url: '/system/data_classify_manage',
    method: 'put',
    data: data
  })
}

// 删除数据分类管理
export function delData_classify_manage(id) {
  return request({
    url: '/system/data_classify_manage/' + id,
    method: 'delete'
  })
}
