package org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceELA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08059921\"]}");
	add("{\"term\":\"elaborateness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04705460\", \"04774107\"]}");
	add("{\"term\":\"elaboration\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00251577\", \"04774107\", \"07187407\", \"07372279\", \"00372295\"]}");
	add("{\"term\":\"elaeagnaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12346014\"]}");
	add("{\"term\":\"elaeagnus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12346184\"]}");
	add("{\"term\":\"elaeis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12610878\"]}");
	add("{\"term\":\"elaeocarpaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12212890\"]}");
	add("{\"term\":\"elaeocarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12213239\"]}");
	add("{\"term\":\"elagatis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02579922\"]}");
	add("{\"term\":\"elam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08933015\"]}");
	add("{\"term\":\"elamite\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06981128\", \"09661694\"]}");
	add("{\"term\":\"elamitic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06981128\"]}");
	add("{\"term\":\"elan\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04640927\", \"04820120\", \"07570967\"]}");
	add("{\"term\":\"eland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02429459\"]}");
	add("{\"term\":\"elanoides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01611575\"]}");
	add("{\"term\":\"elanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01611877\"]}");
	add("{\"term\":\"elaphe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01735086\"]}");
	add("{\"term\":\"elaphure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02438148\"]}");
	add("{\"term\":\"elaphurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02438017\"]}");
	add("{\"term\":\"elapid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01747766\"]}");
	add("{\"term\":\"elapidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01747298\"]}");
	add("{\"term\":\"elasmobranch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01484712\"]}");
	add("{\"term\":\"elasmobranchii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01484240\"]}");
	add("{\"term\":\"elastance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11453812\"]}");
	add("{\"term\":\"elastase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14873710\"]}");
	add("{\"term\":\"elastic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03272607\", \"04123192\"]}");
	add("{\"term\":\"elasticity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05027524\"]}");
	add("{\"term\":\"elastin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05295230\"]}");
	add("{\"term\":\"elastomer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14864753\"]}");
	add("{\"term\":\"elastoplast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03273053\"]}");
	add("{\"term\":\"elastosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14058984\"]}");
	add("{\"term\":\"elater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02178913\"]}");
	add("{\"term\":\"elaterid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02178913\"]}");
	add("{\"term\":\"elateridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02178725\"]}");
	add("{\"term\":\"elation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07543044\", \"14428629\"]}");
	add("{\"term\":\"elavil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02705434\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }