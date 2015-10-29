package org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceERO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eroding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13496741\"]}");
	add("{\"term\":\"erodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12709287\"]}");
	add("{\"term\":\"erodium cicutarium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12709664\"]}");
	add("{\"term\":\"erodium moschatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12710066\"]}");
	add("{\"term\":\"erodium texanum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12710252\"]}");
	add("{\"term\":\"erogenous zone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05232259\"]}");
	add("{\"term\":\"erolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02029863\"]}");
	add("{\"term\":\"erolia alpina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02030146\"]}");
	add("{\"term\":\"erolia minutilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02030011\"]}");
	add("{\"term\":\"eros\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07503095\", \"09583025\"]}");
	add("{\"term\":\"erose leaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13182049\"]}");
	add("{\"term\":\"erosion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13474601\", \"13497147\", \"14542526\", \"13496741\"]}");
	add("{\"term\":\"erotic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10082523\"]}");
	add("{\"term\":\"erotic love\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07503480\"]}");
	add("{\"term\":\"erotica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00748513\"]}");
	add("{\"term\":\"eroticism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07504199\", \"14061407\"]}");
	add("{\"term\":\"erotism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07504199\", \"14061407\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }