package org.swtk.commons.dict.wordnet.index.name.instance.a.n.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"anomala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02176223\"]}");
	add("{\"term\":\"anomalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09629572\"]}");
	add("{\"term\":\"anomalopidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01454165\"]}");
	add("{\"term\":\"anomalops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01454504\"]}");
	add("{\"term\":\"anomalopteryx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01526134\"]}");
	add("{\"term\":\"anomalousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14529423\"]}");
	add("{\"term\":\"anomaly\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08640338\", \"09629719\", \"14529423\"]}");
	add("{\"term\":\"anomia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01964991\", \"14122145\"]}");
	add("{\"term\":\"anomie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04859096\", \"14439302\"]}");
	add("{\"term\":\"anomiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01964864\"]}");
	add("{\"term\":\"anomy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04859096\", \"14439302\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }