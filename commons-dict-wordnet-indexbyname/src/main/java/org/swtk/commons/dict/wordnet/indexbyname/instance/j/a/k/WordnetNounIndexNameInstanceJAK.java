package org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07770660\"]}");
	add("{\"term\":\"jakarta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08929492\"]}");
	add("{\"term\":\"jakes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03865924\"]}");
	add("{\"term\":\"jakob behmen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10873993\"]}");
	add("{\"term\":\"jakob bernoulli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10867952\"]}");
	add("{\"term\":\"jakob boehm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10873993\"]}");
	add("{\"term\":\"jakob boehme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10873993\"]}");
	add("{\"term\":\"jakob bohme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10873993\"]}");
	add("{\"term\":\"jakob grimm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11036559\"]}");
	add("{\"term\":\"jakob hermandszoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10842566\"]}");
	add("{\"term\":\"jakob liebmann beer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11197685\"]}");
	add("{\"term\":\"jakob ludwig karl grimm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11036559\"]}");
	add("{\"term\":\"jakobson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11098764\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }