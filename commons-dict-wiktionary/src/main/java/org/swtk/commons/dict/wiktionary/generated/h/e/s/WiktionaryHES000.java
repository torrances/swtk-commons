package org.swtk.commons.dict.wiktionary.generated.h.e.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHES000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hesc", "{\"term\":\"hesc\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{initialism of|human embryonic stem cell|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Abbreviation of human Embryonic Stem Cell\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hest", "{\"term\":\"hest\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) alteration of Middle english (1100-1500) \u0027hes\u0027 from Old english (ca. 450-1100) {{m|ang|hǣs||command}}. Akin to Old english (ca. 450-1100) \u0027hatan|hātan\u0027 \u0026quot;to command\u0026quot;. More at hight.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Command, injunction\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1610\u0027\u0027, \u0027s:The The Tempest\u0027, by w:William Shakespeare, act 3 scene\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"FERDINAND: [...] What is your name\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"MIRANDA. Miranda — O my father! / I have broke your \u0027\u0027hest\u0027\u0027 to say so\", \"priority\":4}]}, \"synonyms\":{}}");

	add("hesiod", "{\"term\":\"hesiod\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027hēsiodus\u0027 from Ancient greek (to 1453) \u0027ἡσίοδος\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an Ancient Greek poet and a rhapsodist\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hesitater", "{\"term\":\"hesitater\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hesitate|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who hesitates\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hesitation", "{\"term\":\"hesitation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|haesitātiōnem}}, accusative singular of {{m|la|haesitātiō||hesitating, stammering}}, from {{m|la|haesitō||hesitate}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An act of hesitating; suspension of opinion or action; doubt; vacillation\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A faltering in speech; stammering\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hesperia", "{\"term\":\"hesperia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003dmul}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Literally \u0026quot;western land\u0026quot;, a term poetically applied by Ancient Greeks to Italy and by Romans to the Iberian Peninsula and Western Africa\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One of the Hesperides\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Short for , a main belt asteroid\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A city in southern California\", \"priority\":4}]}, \"synonyms\":{}}");

	add("hesperides", "{\"term\":\"hesperides\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027hesperides\u0027 from Ancient greek (to 1453) \u0027ἑσπερίδες\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a group of nymphs who tend a blissful garden in a far western corner of the world, located in Libya or the Atlas mountains in North Africa at the edge of the encircling Oceanus; the nymphs are said to be the daughters of Hesperus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hesperidin", "{\"term\":\"hesperidin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hesperidium|in|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A citrus flavonoid compound, reported as the predominant flavonoid in lemons and oranges. Chemically, it is hesperetin-7-rutinoside, namely (S)-7-[\u0026amp;zwj;[6-0-(6-deoxy-alpha-L-mannopyranosyl)-beta-D-glucopyranosyl] oxy]-2,3-dihydro-5-hydroxy-2-(3-hydroxy-4-methoxyphenyl)-4H-1-benzopyran-4-one\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hesperus", "{\"term\":\"hesperus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027hesperus\u0027, from Ancient greek (to 1453) \u0027ἕσπερος\u0027 originally an adjective ‘western’.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The planet Venus when observed as an evening star\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hestia", "{\"term\":\"hestia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) {{m|grc|Ἑστία}}, from {{m|grc|ἑστία||hearth}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The virgin goddess of the hearth, and the household, and therefore of domestic life\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Short for , a main belt asteroid\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }