package org.swtk.commons.dict.wiktionary.generated.a.s.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryASE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aseity", "{\"term\":\"aseity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027\u0027 + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Being self-derived, in contrast to being derived from or dependent on another; being self-existent, having independent existence\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1902\u0027\u0027, William James, \u0027The Varieties of Religious Experience\u0027, Folio Society 2008, p. 374\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"He is \u0027Spiritual\u0027, for were He composed of physical parts, some other power would have to combine them into the total, and his \u0027\u0027aseity\u0027\u0027 would thus be contradicted\", \"priority\":3}]}, \"synonyms\":{}}");

	add("asemia", "{\"term\":\"asemia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Loss of power to express, or to understand, symbols or signs of thought\", \"priority\":1}]}, \"synonyms\":{}}");

	add("asepsis", "{\"term\":\"asepsis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being free from sepsis\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The process of removing pathogenic organisms or protecting against such organisms\", \"priority\":2}]}, \"synonyms\":{}}");

	add("asexuality", "{\"term\":\"asexuality\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|a|gloss1\u003dwithout|sexuality|lang\u003den}}; {{suffix|asexual|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being asexual, that is\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The state of not experiencing sexual attraction. Compare \u0027heterosexuality\u0027, \u0027homosexuality\u0027, \u0027bisexuality\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The state of not having a sex or sexual organs\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1971?\u0027\u0027, Roelof van den Broek, \u0027The Myth of the Phoenix\u0027, page 421\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The same holds for Vincentius Victor in his discussion of the \u0027\u0027asexuality\u0027\u0027 of the corporeal form of the soul. In Lactantius, who emphasizes the uncertainty concerning the sex of the phoenix, and in Zeno of Verona, who says that the phoenix is for itself both sexes, the background is again formed by the inferred \u0027\u0027asexuality\u0027\u0027 of the phoenix\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The quality (of a species or organism) of reproducing asexually\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027, Gimme Hugh Walter\u0026lt;!--sic--\u0026gt;, \u0027Insect Pest Management and Ecological Research\u0027, page 166\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027asexuality\u0027\u0027 of insects is, in almost all cases, known to be a derived condition. That is, their evolution was contingent on the sexuality of their ancestral forms\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"2009\u0027\u0027, Chapter 13 of \u0027Lost Sex: The Evolutionary Biology of Parthenogenesis\u0027, Isa Schön, Koen Martens, Peter van Dijk (editors), page 263\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"While interpreted as supporting the \u0027\u0027asexuality\u0027\u0027 of bdelloids\", \"priority\":10}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }