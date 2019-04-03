package com.liwenguang;

import io.grpc.fcw.Response;
import io.grpc.fcw.SendAliPayRequest;
import io.grpc.fcw.SendPayNotifyGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;

/**
 * @Author liwenguang
 * @Date 2019-04-03 23:58
 * @Description 
 */
@Slf4j
@GRpcService
public class SendPayNotifyService extends SendPayNotifyGrpc.SendPayNotifyImplBase {

    @Override
    @Async
    public StreamObserver<SendAliPayRequest> sendAliPayNotify(StreamObserver<Response> responseObserver) {
        return new StreamObserver<SendAliPayRequest>() {

            @Override
            public void onNext(SendAliPayRequest request) {

            }

            @Override
            public void onError(Throwable t) {
                log.error(t.getMessage(), t);
            }

            @Override
            public void onCompleted() {
            }
        };
    }

}