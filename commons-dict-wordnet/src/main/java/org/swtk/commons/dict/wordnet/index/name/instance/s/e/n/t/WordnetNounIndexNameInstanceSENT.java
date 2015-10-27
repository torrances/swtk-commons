package org.swtk.commons.dict.wordnet.index.name.instance.s.e.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSENT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13722553\"]}");
	add("{\"term\":\"sente\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13709861\"]}");
	add("{\"term\":\"sentence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15249488\", \"01191772\", \"06295743\"]}");
	add("{\"term\":\"sentience\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05013204\", \"05659816\", \"05685793\"]}");
	add("{\"term\":\"sentiency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05659816\"]}");
	add("{\"term\":\"sentiment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05954491\", \"07497091\"]}");
	add("{\"term\":\"sentimentalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01221796\"]}");
	add("{\"term\":\"sentimentalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04635437\", \"06788613\"]}");
	add("{\"term\":\"sentimentalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10599128\"]}");
	add("{\"term\":\"sentimentality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07497268\", \"04634863\"]}");
	add("{\"term\":\"sentimentalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01221796\"]}");
	add("{\"term\":\"sentinel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10290913\"]}");
	add("{\"term\":\"sentry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10290913\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }