import { useQuery } from "react-query";
import { MdmsService } from "../../services/elements/MDMS";

const useAssetparentSubType = (tenantId, moduleCode, type, config = {}) => {
  const useAssetparentsubsub = () => {
    return useQuery("AST_PARENT_SUB_TYPE", () => MdmsService.AST_PARENT(tenantId, moduleCode ,type), config);
  };
  
  return type === "assetSubCategory" ? useAssetparentsubsub() : null;
};



export default useAssetparentSubType;