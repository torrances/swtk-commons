package org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFOX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fox\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"06922624\", \"09675274\", \"10996858\", \"10996993\", \"14789089\", \"10042484\", \"02120985\"]}");
	add("{\"term\":\"fox grape\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07774926\", \"13165817\"]}");
	add("{\"term\":\"fox hole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03394921\"]}");
	add("{\"term\":\"fox hunter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10128117\"]}");
	add("{\"term\":\"fox hunting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00454502\"]}");
	add("{\"term\":\"fox river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09308034\"]}");
	add("{\"term\":\"fox shark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01488651\"]}");
	add("{\"term\":\"fox squirrel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02359450\"]}");
	add("{\"term\":\"fox talbot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11349276\"]}");
	add("{\"term\":\"fox terrier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02097702\"]}");
	add("{\"term\":\"foxberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12270059\"]}");
	add("{\"term\":\"foxglove\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12903539\"]}");
	add("{\"term\":\"foxglove family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12896792\"]}");
	add("{\"term\":\"foxhole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03394921\"]}");
	add("{\"term\":\"foxhound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02092207\"]}");
	add("{\"term\":\"foxhunt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00454502\"]}");
	add("{\"term\":\"foxiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05628961\"]}");
	add("{\"term\":\"foxtail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12128487\"]}");
	add("{\"term\":\"foxtail barley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12144449\"]}");
	add("{\"term\":\"foxtail grass\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12128487\", \"13244741\"]}");
	add("{\"term\":\"foxtail millet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12155787\"]}");
	add("{\"term\":\"foxtail orchid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12102150\"]}");
	add("{\"term\":\"foxtrot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00536993\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }