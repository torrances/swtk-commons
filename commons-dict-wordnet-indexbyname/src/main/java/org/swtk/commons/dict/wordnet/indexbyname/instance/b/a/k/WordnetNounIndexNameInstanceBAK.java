package org.swtk.commons.dict.wordnet.indexbyname.instance.b.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bakeapple\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12678055\"]}");
	add("{\"term\":\"bakehouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02779636\"]}");
	add("{\"term\":\"bakelite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14620396\"]}");
	add("{\"term\":\"baker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09852896\", \"09853011\"]}");
	add("{\"term\":\"bakersfield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09084790\"]}");
	add("{\"term\":\"bakery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02779636\"]}");
	add("{\"term\":\"bakeshop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02779636\"]}");
	add("{\"term\":\"baking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00247208\", \"00717095\"]}");
	add("{\"term\":\"baklava\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07643399\"]}");
	add("{\"term\":\"baksheesh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13319724\"]}");
	add("{\"term\":\"bakshis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13319724\"]}");
	add("{\"term\":\"bakshish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13319724\"]}");
	add("{\"term\":\"baku\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09040796\"]}");
	add("{\"term\":\"bakunin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10851079\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }