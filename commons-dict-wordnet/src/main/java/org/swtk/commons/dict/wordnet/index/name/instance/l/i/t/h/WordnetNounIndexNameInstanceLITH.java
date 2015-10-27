package org.swtk.commons.dict.wordnet.index.name.instance.l.i.t.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLITH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lithane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14966022\"]}");
	add("{\"term\":\"litheness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05011256\"]}");
	add("{\"term\":\"lithiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14139396\"]}");
	add("{\"term\":\"lithium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14667971\"]}");
	add("{\"term\":\"lithocarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12285783\"]}");
	add("{\"term\":\"lithodidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01983634\"]}");
	add("{\"term\":\"lithoglyptics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03447411\"]}");
	add("{\"term\":\"lithograph\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03683302\", \"03683546\"]}");
	add("{\"term\":\"lithographer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10286183\"]}");
	add("{\"term\":\"lithography\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00941154\", \"06692747\"]}");
	add("{\"term\":\"lithology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06130982\"]}");
	add("{\"term\":\"lithomancer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10286441\"]}");
	add("{\"term\":\"lithomancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05785295\"]}");
	add("{\"term\":\"lithonate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14966022\"]}");
	add("{\"term\":\"lithophragma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12820340\"]}");
	add("{\"term\":\"lithophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13144600\"]}");
	add("{\"term\":\"lithops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11840932\"]}");
	add("{\"term\":\"lithospermum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12841194\"]}");
	add("{\"term\":\"lithosphere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09362716\"]}");
	add("{\"term\":\"lithotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00684611\"]}");
	add("{\"term\":\"lithuania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09036200\"]}");
	add("{\"term\":\"lithuanian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06958961\", \"09726685\"]}");
	add("{\"term\":\"lithuresis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13530153\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }