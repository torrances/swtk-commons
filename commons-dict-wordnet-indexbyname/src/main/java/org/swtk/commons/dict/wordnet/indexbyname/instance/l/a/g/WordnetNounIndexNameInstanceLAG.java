package org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lag\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04314407\", \"15297873\", \"01069501\"]}");
	add("{\"term\":\"lag bolt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03639177\"]}");
	add("{\"term\":\"lag screw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03639177\"]}");
	add("{\"term\":\"lagan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03638765\"]}");
	add("{\"term\":\"lagarostrobus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11676215\"]}");
	add("{\"term\":\"lagarostrobus colensoi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11676425\"]}");
	add("{\"term\":\"lagarostrobus franklinii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11676574\"]}");
	add("{\"term\":\"lagenaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12186520\"]}");
	add("{\"term\":\"lagenaria siceraria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12186645\"]}");
	add("{\"term\":\"lagend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03638765\"]}");
	add("{\"term\":\"lagenophera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12008191\"]}");
	add("{\"term\":\"lager\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07903609\", \"03635148\"]}");
	add("{\"term\":\"lager beer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07903609\"]}");
	add("{\"term\":\"lagerphone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03638923\"]}");
	add("{\"term\":\"lagerstroemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12349537\"]}");
	add("{\"term\":\"lagerstroemia indica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12349777\"]}");
	add("{\"term\":\"lagerstroemia speciosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12349990\"]}");
	add("{\"term\":\"laggard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10012790\"]}");
	add("{\"term\":\"lagger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10012790\"]}");
	add("{\"term\":\"lagging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14811102\"]}");
	add("{\"term\":\"lagidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02370330\"]}");
	add("{\"term\":\"lagniappe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13292820\"]}");
	add("{\"term\":\"lagodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02594874\"]}");
	add("{\"term\":\"lagodon rhomboides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02595001\"]}");
	add("{\"term\":\"lagomorph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02326101\"]}");
	add("{\"term\":\"lagomorpha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02325838\"]}");
	add("{\"term\":\"lagoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09351652\"]}");
	add("{\"term\":\"lagophthalmos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14222628\"]}");
	add("{\"term\":\"lagopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01798863\"]}");
	add("{\"term\":\"lagopus scoticus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01799160\"]}");
	add("{\"term\":\"lagorchestes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01880844\"]}");
	add("{\"term\":\"lagos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08996974\"]}");
	add("{\"term\":\"lagostomus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02370645\"]}");
	add("{\"term\":\"lagostomus maximus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02370768\"]}");
	add("{\"term\":\"lagothrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02496888\"]}");
	add("{\"term\":\"laguna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09351652\"]}");
	add("{\"term\":\"laguncularia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12345610\"]}");
	add("{\"term\":\"laguncularia racemosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12345751\"]}");
	add("{\"term\":\"lagune\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09351652\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }