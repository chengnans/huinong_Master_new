import request from '@/utils/request'

// 查询农事记录列表
export function listFarm_record(query) {
  return request({
    url: '/system/farm_record/list',
    method: 'get',
    params: query
  })
}

// 查询农事记录详细
export function getFarm_record(id) {
  return request({
    url: '/system/farm_record/' + id,
    method: 'get'
  })
}

// 新增农事记录
export function addFarm_record(data) {
  return request({
    url: '/system/farm_record',
    method: 'post',
    data: data
  })
}

// 修改农事记录
export function updateFarm_record(data) {
  return request({
    url: '/system/farm_record',
    method: 'put',
    data: data
  })
}

// 删除农事记录
export function delFarm_record(id) {
  return request({
    url: '/system/farm_record/' + id,
    method: 'delete'
  })
}
