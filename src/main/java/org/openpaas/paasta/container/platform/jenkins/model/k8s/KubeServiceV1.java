package org.openpaas.paasta.container.platform.jenkins.model.k8s;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1ServiceSpec;
import io.kubernetes.client.models.V1ServiceStatus;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class KubeServiceV1 {
    @SerializedName("apiVersion")
    private String apiVersion = null;

    @SerializedName("kind")
    private String kind = null;

    @SerializedName("metadata")
    private KubeMetadataV1 metadata = null;

    @SerializedName("spec")
    private V1ServiceSpec spec = null;

    @SerializedName("status")
    private V1ServiceStatus status = null;

    public KubeServiceV1 apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
     * @return apiVersion
     **/
    @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public KubeServiceV1 kind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
     * @return kind
     **/
    @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public KubeServiceV1 metadata(KubeMetadataV1 metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * @return metadata
     **/
    @ApiModelProperty(value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
    public KubeMetadataV1 getMetadata() {
        return metadata;
    }

    public void setMetadata(KubeMetadataV1 metadata) {
        this.metadata = metadata;
    }

    public KubeServiceV1 spec(V1ServiceSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Spec defines the behavior of a service. https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * @return spec
     **/
    @ApiModelProperty(value = "Spec defines the behavior of a service. https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
    public V1ServiceSpec getSpec() {
        return spec;
    }

    public void setSpec(V1ServiceSpec spec) {
        this.spec = spec;
    }

    public KubeServiceV1 status(V1ServiceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Most recently observed status of the service. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
     * @return status
     **/
    @ApiModelProperty(value = "Most recently observed status of the service. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
    public V1ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(V1ServiceStatus status) {
        this.status = status;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KubeServiceV1 v1Service = (KubeServiceV1) o;
        return Objects.equals(this.apiVersion, v1Service.apiVersion) &&
                Objects.equals(this.kind, v1Service.kind) &&
                Objects.equals(this.metadata, v1Service.metadata) &&
                Objects.equals(this.spec, v1Service.spec) &&
                Objects.equals(this.status, v1Service.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1Service {\n");

        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


}
