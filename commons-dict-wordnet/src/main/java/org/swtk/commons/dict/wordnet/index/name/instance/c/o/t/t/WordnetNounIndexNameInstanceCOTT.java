package org.swtk.commons.dict.wordnet.index.name.instance.c.o.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOTT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cottage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02923176\"]}");
	add("{\"term\":\"cottager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09988079\"]}");
	add("{\"term\":\"cottar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03119490\", \"09988271\"]}");
	add("{\"term\":\"cotter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03119490\", \"09988182\", \"09988271\"]}");
	add("{\"term\":\"cottidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02647597\"]}");
	add("{\"term\":\"cottier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09988182\"]}");
	add("{\"term\":\"cotton\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03119952\", \"12196466\", \"03119831\", \"14894229\"]}");
	add("{\"term\":\"cottonmouth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01757174\"]}");
	add("{\"term\":\"cottonseed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11710284\"]}");
	add("{\"term\":\"cottontail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02328018\"]}");
	add("{\"term\":\"cottonweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11846218\", \"11941864\"]}");
	add("{\"term\":\"cottonwick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02591826\"]}");
	add("{\"term\":\"cottonwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12224413\", \"12753516\"]}");
	add("{\"term\":\"cottus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02647773\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }