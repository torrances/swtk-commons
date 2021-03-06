package org.swtk.commons.dict.wordnet.indexbyname.instance.a.m.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"amobarbital\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02706358\"]}");
	add("{\"term\":\"amobarbital sodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02706551\"]}");
	add("{\"term\":\"amoeba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01395021\"]}");
	add("{\"term\":\"amoebiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14198647\"]}");
	add("{\"term\":\"amoebic dysentery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14198795\"]}");
	add("{\"term\":\"amoebida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01394210\"]}");
	add("{\"term\":\"amoebina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01394210\"]}");
	add("{\"term\":\"amoebiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14198647\"]}");
	add("{\"term\":\"amon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09534502\"]}");
	add("{\"term\":\"amontillado\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07917504\"]}");
	add("{\"term\":\"amor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09583190\"]}");
	add("{\"term\":\"amora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09808202\"]}");
	add("{\"term\":\"amoralism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05967294\"]}");
	add("{\"term\":\"amoralist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09808591\"]}");
	add("{\"term\":\"amorality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04862124\"]}");
	add("{\"term\":\"amorist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09808745\"]}");
	add("{\"term\":\"amorousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07504199\", \"07559601\"]}");
	add("{\"term\":\"amorpha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12524599\"]}");
	add("{\"term\":\"amorpha californica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12525075\"]}");
	add("{\"term\":\"amorpha canescens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12524811\"]}");
	add("{\"term\":\"amorpha fruticosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12525288\"]}");
	add("{\"term\":\"amorphophallus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11803230\"]}");
	add("{\"term\":\"amorphophallus campanulatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11803347\"]}");
	add("{\"term\":\"amorphophallus paeonifolius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11803347\"]}");
	add("{\"term\":\"amorphophallus rivieri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11803631\"]}");
	add("{\"term\":\"amorphophallus titanum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11803957\"]}");
	add("{\"term\":\"amorphous shape\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13890113\"]}");
	add("{\"term\":\"amortisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01123391\", \"01125259\"]}");
	add("{\"term\":\"amortization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01123391\", \"01125259\"]}");
	add("{\"term\":\"amos\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06451230\", \"10835740\"]}");
	add("{\"term\":\"amount\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05869651\", \"00033914\", \"05115065\", \"13352213\"]}");
	add("{\"term\":\"amount of money\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13352213\"]}");
	add("{\"term\":\"amour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13954922\"]}");
	add("{\"term\":\"amour propre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07524235\"]}");
	add("{\"term\":\"amoxicillin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02706753\"]}");
	add("{\"term\":\"amoxil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02706753\"]}");
	add("{\"term\":\"amoy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06943410\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }