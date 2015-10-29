package org.swtk.commons.dict.wordnet.indexbyname.instance.p.h.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phlebectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00691385\"]}");
	add("{\"term\":\"phlebitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14376295\"]}");
	add("{\"term\":\"phlebodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13197771\"]}");
	add("{\"term\":\"phlebodium aureum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13197946\"]}");
	add("{\"term\":\"phlebogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04533407\"]}");
	add("{\"term\":\"phlebothrombosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14376413\"]}");
	add("{\"term\":\"phlebotomist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10446127\"]}");
	add("{\"term\":\"phlebotomus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02206736\", \"14242969\"]}");
	add("{\"term\":\"phlebotomus papatasii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02206901\"]}");
	add("{\"term\":\"phlebotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00699862\"]}");
	add("{\"term\":\"phlegm\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04643310\", \"05423159\", \"07498922\"]}");
	add("{\"term\":\"phlegmasia alba dolens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14126500\"]}");
	add("{\"term\":\"phleum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12150925\"]}");
	add("{\"term\":\"phleum pratense\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12151066\"]}");
	add("{\"term\":\"phloem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13119721\"]}");
	add("{\"term\":\"phlogiston\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14607408\"]}");
	add("{\"term\":\"phlogopite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14714951\"]}");
	add("{\"term\":\"phlomis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12882105\"]}");
	add("{\"term\":\"phlomis fruticosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12882301\"]}");
	add("{\"term\":\"phlox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12831355\"]}");
	add("{\"term\":\"phlox bifida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12831607\"]}");
	add("{\"term\":\"phlox family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12829693\"]}");
	add("{\"term\":\"phlox stellaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12831607\"]}");
	add("{\"term\":\"phlox subulata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12831787\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }