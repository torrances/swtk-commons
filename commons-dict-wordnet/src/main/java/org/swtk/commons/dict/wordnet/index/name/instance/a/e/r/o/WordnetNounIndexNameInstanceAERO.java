package org.swtk.commons.dict.wordnet.index.name.instance.a.e.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAERO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aerobacter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01356414\"]}");
	add("{\"term\":\"aerobatics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00303687\"]}");
	add("{\"term\":\"aerobe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01329538\"]}");
	add("{\"term\":\"aerobics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00627098\"]}");
	add("{\"term\":\"aerobiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11494085\"]}");
	add("{\"term\":\"aerodontalgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14347508\"]}");
	add("{\"term\":\"aerodrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02695091\"]}");
	add("{\"term\":\"aerodynamics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06123958\"]}");
	add("{\"term\":\"aeroembolism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14091826\", \"14124799\"]}");
	add("{\"term\":\"aerofoil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02691302\"]}");
	add("{\"term\":\"aerogenerator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04594707\"]}");
	add("{\"term\":\"aerogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06638567\"]}");
	add("{\"term\":\"aerogramme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06638567\"]}");
	add("{\"term\":\"aerolite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09212186\"]}");
	add("{\"term\":\"aerology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06128833\"]}");
	add("{\"term\":\"aeromechanics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06123958\"]}");
	add("{\"term\":\"aeromedicine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06055568\"]}");
	add("{\"term\":\"aeronaut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09845606\"]}");
	add("{\"term\":\"aeronautics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106520\"]}");
	add("{\"term\":\"aerophagia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00841718\"]}");
	add("{\"term\":\"aerophilately\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01018570\"]}");
	add("{\"term\":\"aerophile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09795627\"]}");
	add("{\"term\":\"aerophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13143744\"]}");
	add("{\"term\":\"aeroplane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02694015\"]}");
	add("{\"term\":\"aerosol\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02685776\", \"11442711\"]}");
	add("{\"term\":\"aerospace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08519192\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }