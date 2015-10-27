package org.swtk.commons.dict.wordnet.index.name.instance.c.a.m.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAMP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"camp\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"02949049\", \"02949268\", \"05657805\", \"02948834\", \"08257554\", \"02948616\", \"08495029\", \"02948281\"]}");
	add("{\"term\":\"campaign\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00310732\", \"00970259\", \"00799906\", \"07488069\"]}");
	add("{\"term\":\"campaigner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09909143\"]}");
	add("{\"term\":\"campaigning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00801198\"]}");
	add("{\"term\":\"campana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13908953\"]}");
	add("{\"term\":\"campania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08822974\"]}");
	add("{\"term\":\"campanile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02949582\"]}");
	add("{\"term\":\"campanula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12057408\"]}");
	add("{\"term\":\"campanulaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12057002\"]}");
	add("{\"term\":\"campanulales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11931743\"]}");
	add("{\"term\":\"campbell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10900733\"]}");
	add("{\"term\":\"campeachy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12517454\"]}");
	add("{\"term\":\"campeche\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08758316\", \"08758450\"]}");
	add("{\"term\":\"campephilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01842919\"]}");
	add("{\"term\":\"camper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02949803\", \"09909393\"]}");
	add("{\"term\":\"campfire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07318203\"]}");
	add("{\"term\":\"campground\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08535449\"]}");
	add("{\"term\":\"camphor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14815149\"]}");
	add("{\"term\":\"camphorweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12892456\"]}");
	add("{\"term\":\"camping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01057089\"]}");
	add("{\"term\":\"campion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11835960\"]}");
	add("{\"term\":\"campmate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09909863\"]}");
	add("{\"term\":\"campong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08690777\"]}");
	add("{\"term\":\"camponotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02223328\"]}");
	add("{\"term\":\"campsite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08535449\"]}");
	add("{\"term\":\"campstool\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02950208\"]}");
	add("{\"term\":\"camptosorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13202514\"]}");
	add("{\"term\":\"campus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08535652\"]}");
	add("{\"term\":\"campyloneurum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13195413\"]}");
	add("{\"term\":\"campylorhynchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01588811\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }