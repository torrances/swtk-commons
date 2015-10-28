package org.swtk.commons.dict.wordnet.indexbyname.instance.e.y.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEYE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eye\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03313242\", \"08540894\", \"05711254\", \"05622259\", \"05318579\"]}");
	add("{\"term\":\"eyeball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05323575\"]}");
	add("{\"term\":\"eyebath\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03313559\"]}");
	add("{\"term\":\"eyebrow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05321060\"]}");
	add("{\"term\":\"eyecup\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02158330\", \"03313559\"]}");
	add("{\"term\":\"eyedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05074976\"]}");
	add("{\"term\":\"eyedrop\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00657886\", \"13794069\"]}");
	add("{\"term\":\"eyeful\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00883592\", \"10094851\"]}");
	add("{\"term\":\"eyeglass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03788963\"]}");
	add("{\"term\":\"eyeglasses\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04279164\"]}");
	add("{\"term\":\"eyehole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03313798\", \"03911327\"]}");
	add("{\"term\":\"eyeish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09675171\"]}");
	add("{\"term\":\"eyelash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05322469\"]}");
	add("{\"term\":\"eyelessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14580798\"]}");
	add("{\"term\":\"eyelet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03137089\", \"03313798\"]}");
	add("{\"term\":\"eyelid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05321347\"]}");
	add("{\"term\":\"eyeliner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03314055\"]}");
	add("{\"term\":\"eyepatch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03314301\"]}");
	add("{\"term\":\"eyepiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03314410\"]}");
	add("{\"term\":\"eyes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05958470\"]}");
	add("{\"term\":\"eyeshade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02841963\"]}");
	add("{\"term\":\"eyeshadow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03314632\"]}");
	add("{\"term\":\"eyeshot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08578489\"]}");
	add("{\"term\":\"eyesight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05664382\"]}");
	add("{\"term\":\"eyesore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04701065\"]}");
	add("{\"term\":\"eyespot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04688978\"]}");
	add("{\"term\":\"eyestrain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14040334\"]}");
	add("{\"term\":\"eyetooth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05314590\"]}");
	add("{\"term\":\"eyewash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03314159\"]}");
	add("{\"term\":\"eyewitness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10095087\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }