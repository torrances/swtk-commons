package org.swtk.commons.dict.wordnet.index.name.instance.s.e.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSELE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"selection\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06412153\", \"13584949\", \"05798247\", \"08416775\", \"00162063\"]}");
	add("{\"term\":\"selectivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05216256\"]}");
	add("{\"term\":\"selectman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10596128\"]}");
	add("{\"term\":\"selector\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04176498\", \"10451389\"]}");
	add("{\"term\":\"selectwoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10596270\"]}");
	add("{\"term\":\"selenarctos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02136164\"]}");
	add("{\"term\":\"selene\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02580756\", \"09594268\"]}");
	add("{\"term\":\"selenicereus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11874113\"]}");
	add("{\"term\":\"selenipedium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12103265\"]}");
	add("{\"term\":\"selenium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14678354\"]}");
	add("{\"term\":\"selenolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01048812\"]}");
	add("{\"term\":\"selenology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06107590\"]}");
	add("{\"term\":\"seles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11311441\"]}");
	add("{\"term\":\"seleucus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11311565\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }