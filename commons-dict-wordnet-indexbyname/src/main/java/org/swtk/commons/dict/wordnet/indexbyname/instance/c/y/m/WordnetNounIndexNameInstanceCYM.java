package org.swtk.commons.dict.wordnet.indexbyname.instance.c.y.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCYM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cyma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03161656\"]}");
	add("{\"term\":\"cymatiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01950254\"]}");
	add("{\"term\":\"cymatium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03161656\"]}");
	add("{\"term\":\"cymbal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03162014\"]}");
	add("{\"term\":\"cymbalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10005988\"]}");
	add("{\"term\":\"cymbid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12075985\"]}");
	add("{\"term\":\"cymbidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12075985\"]}");
	add("{\"term\":\"cyme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13153699\"]}");
	add("{\"term\":\"cymene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14852149\"]}");
	add("{\"term\":\"cymling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12180642\"]}");
	add("{\"term\":\"cymograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03634934\"]}");
	add("{\"term\":\"cymric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06974297\"]}");
	add("{\"term\":\"cymru\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08914683\"]}");
	add("{\"term\":\"cymry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09766660\"]}");
	add("{\"term\":\"cymule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13153899\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }