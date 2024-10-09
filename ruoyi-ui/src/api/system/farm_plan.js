import request from '@/utils/request'

// 查询农事计划列表
export function listFarm_plan(query) {
  return request({
    url: '/system/farm_plan/list',
    method: 'get',
    params: query
  })
}

// 查询农事计划详细
export function getFarm_plan(id) {
  return request({
    url: '/system/farm_plan/' + id,
    method: 'get'
  })
}

// 新增农事计划
export function addFarm_plan(data) {
  return request({
    url: '/system/farm_plan',
    method: 'post',
    data: data
  })
}

// 修改农事计划
export function updateFarm_plan(data) {
  return request({
    url: '/system/farm_plan',
    method: 'put',
    data: data
  })
}

// 删除农事计划
export function delFarm_plan(id) {
  return request({
    url: '/system/farm_plan/' + id,
    method: 'delete'
  })
}
