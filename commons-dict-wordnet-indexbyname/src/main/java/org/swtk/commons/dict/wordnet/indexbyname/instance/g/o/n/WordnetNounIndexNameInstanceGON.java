package org.swtk.commons.dict.wordnet.indexbyname.instance.g.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gonad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05532081\"]}");
	add("{\"term\":\"gonadotrophic hormone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05417658\"]}");
	add("{\"term\":\"gonadotrophin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05417658\"]}");
	add("{\"term\":\"gonadotropic hormone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05417658\"]}");
	add("{\"term\":\"gonadotropin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05417658\"]}");
	add("{\"term\":\"goncalo alves\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12780428\"]}");
	add("{\"term\":\"goncourt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11026427\", \"11026685\"]}");
	add("{\"term\":\"gond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09694006\"]}");
	add("{\"term\":\"gondang wax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14914124\"]}");
	add("{\"term\":\"gondi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06993631\"]}");
	add("{\"term\":\"gondola\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02963937\", \"03452391\", \"03452537\"]}");
	add("{\"term\":\"gondola car\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03452537\"]}");
	add("{\"term\":\"gondolier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10157345\"]}");
	add("{\"term\":\"gondoliere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10157345\"]}");
	add("{\"term\":\"gondwanaland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09313027\"]}");
	add("{\"term\":\"goner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10157456\"]}");
	add("{\"term\":\"gong\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03020822\", \"03452665\"]}");
	add("{\"term\":\"gong buoy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07281278\"]}");
	add("{\"term\":\"gongora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11026885\"]}");
	add("{\"term\":\"gongorism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07082364\"]}");
	add("{\"term\":\"gongorist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10157634\"]}");
	add("{\"term\":\"gonif\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10152978\"]}");
	add("{\"term\":\"goniff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10152978\"]}");
	add("{\"term\":\"goniometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03452838\"]}");
	add("{\"term\":\"gonion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05240430\"]}");
	add("{\"term\":\"goniopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13249765\"]}");
	add("{\"term\":\"gonioscopy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00644632\"]}");
	add("{\"term\":\"gonne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11027055\"]}");
	add("{\"term\":\"gonococcus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01368526\"]}");
	add("{\"term\":\"gonorhynchidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02531580\"]}");
	add("{\"term\":\"gonorhynchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02531742\"]}");
	add("{\"term\":\"gonorhynchus gonorhynchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02531924\"]}");
	add("{\"term\":\"gonorrhea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14157025\"]}");
	add("{\"term\":\"gonorrhoea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14157025\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }