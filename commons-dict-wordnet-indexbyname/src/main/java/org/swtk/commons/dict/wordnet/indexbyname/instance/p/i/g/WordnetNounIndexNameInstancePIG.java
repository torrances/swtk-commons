package org.swtk.commons.dict.wordnet.indexbyname.instance.p.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pig\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03941274\", \"03941392\", \"09898610\", \"10199280\", \"10631726\", \"02398058\"]}");
	add("{\"term\":\"pigboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04354832\"]}");
	add("{\"term\":\"pigeon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01814550\"]}");
	add("{\"term\":\"pigeonhole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03149152\", \"05848172\"]}");
	add("{\"term\":\"pigeonholing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05741035\"]}");
	add("{\"term\":\"pigfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02592724\", \"02610914\"]}");
	add("{\"term\":\"piggery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03941510\"]}");
	add("{\"term\":\"piggishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04893430\"]}");
	add("{\"term\":\"piggy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02398346\"]}");
	add("{\"term\":\"piggyback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00320339\"]}");
	add("{\"term\":\"pigheadedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04870305\"]}");
	add("{\"term\":\"piglet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02398346\"]}");
	add("{\"term\":\"pigman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10703076\"]}");
	add("{\"term\":\"pigment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03880896\", \"15015290\", \"15014387\"]}");
	add("{\"term\":\"pigmentation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04983586\", \"13558825\"]}");
	add("{\"term\":\"pigmy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10516074\", \"10516211\"]}");
	add("{\"term\":\"pignolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07790818\"]}");
	add("{\"term\":\"pignut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12341144\"]}");
	add("{\"term\":\"pigpen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04353506\"]}");
	add("{\"term\":\"pigskin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14787603\"]}");
	add("{\"term\":\"pigsticking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00454655\"]}");
	add("{\"term\":\"pigsty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04353506\"]}");
	add("{\"term\":\"pigswill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07820982\"]}");
	add("{\"term\":\"pigtail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05267397\"]}");
	add("{\"term\":\"pigwash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07820982\"]}");
	add("{\"term\":\"pigweed\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07749688\", \"11844615\", \"11849046\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }