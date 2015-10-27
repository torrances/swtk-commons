package org.swtk.commons.dict.wordnet.index.name.instance.c.y.p.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCYPR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cypraea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01955838\"]}");
	add("{\"term\":\"cypraeidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01955673\"]}");
	add("{\"term\":\"cypre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12839106\"]}");
	add("{\"term\":\"cypress\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11650940\", \"11651341\"]}");
	add("{\"term\":\"cyprian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09718416\", \"10505025\"]}");
	add("{\"term\":\"cyprinid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01441762\"]}");
	add("{\"term\":\"cyprinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01441361\"]}");
	add("{\"term\":\"cypriniformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01440446\"]}");
	add("{\"term\":\"cyprinodont\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01449230\"]}");
	add("{\"term\":\"cyprinodontidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01448924\"]}");
	add("{\"term\":\"cyprinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01442298\"]}");
	add("{\"term\":\"cypriot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09718416\"]}");
	add("{\"term\":\"cypriote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09718416\"]}");
	add("{\"term\":\"cypripedia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12076568\"]}");
	add("{\"term\":\"cypripedium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12076308\"]}");
	add("{\"term\":\"cyproheptadine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03162248\"]}");
	add("{\"term\":\"cyprus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08774568\", \"08774717\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }