package org.swtk.commons.dict.wordnet.index.name.instance.t.h.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHRE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thread\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04161999\", \"05781545\", \"09432081\", \"04433923\"]}");
	add("{\"term\":\"threader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02864849\"]}");
	add("{\"term\":\"threadfin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02613610\"]}");
	add("{\"term\":\"threadfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02580583\"]}");
	add("{\"term\":\"threads\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04453296\"]}");
	add("{\"term\":\"threadworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01934161\"]}");
	add("{\"term\":\"threat\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10722264\", \"06746225\", \"07240675\", \"14566833\"]}");
	add("{\"term\":\"three\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04487671\", \"13766184\"]}");
	add("{\"term\":\"threepence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13412291\"]}");
	add("{\"term\":\"threescore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08289695\"]}");
	add("{\"term\":\"threesome\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08002508\", \"13766184\"]}");
	add("{\"term\":\"threnody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07064659\"]}");
	add("{\"term\":\"threonine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15095266\"]}");
	add("{\"term\":\"thresher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01488651\", \"04435326\"]}");
	add("{\"term\":\"threshing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00393969\"]}");
	add("{\"term\":\"threshold\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"13926744\", \"03228389\", \"03228735\", \"05720373\", \"15293950\"]}");
	add("{\"term\":\"threskiornis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02008865\"]}");
	add("{\"term\":\"threskiornithidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02008252\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }