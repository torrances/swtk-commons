package org.swtk.commons.dict.wiktionary.generated.h.e.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHEB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hebdomad", "{\"term\":\"hebdomad\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From \u0027hebdomas\u0027 () from Ancient greek (to 1453) \u0027ἑβδομάς\u0027 (lang\u003dgrc) from \u0027ἑπτά\u0027 (lang\u003dgrc)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A group of seven\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A period of seven days, a week\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A group of seven superhuman beings\", \"priority\":3}]}, \"synonyms\":{}}");

	add("hebdomadiversary", "{\"term\":\"hebdomadiversary\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"\u0027\u0027 (hebdomad-) (stem of Latin \u0027hebdomas\u0027 “week”) + English \u0027\u0027 (-versary) (second element of \u0027anniversary\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A day marking exactly one week since a significant event; a one-week “anniversary”\", \"priority\":1}]}, \"synonyms\":{}}");

	add("heben", "{\"term\":\"heben\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"old high german (ca. 750-1050)\"], \"text\":\"From Old high german (ca. 750-1050) \u0027heffen\u0027 \u0027heven\u0027 \u0027hevan\u0027 from Proto-germanic {{m|gem-pro|*habjaną}}, from Proto-indo-european {{m|ine-pro|*kh₂pyé-}}, from the root {{m|ine-pro|*keh₂p-||to seize}}. Compare Dutch \u0027heffen\u0027 English \u0027heave\u0027 Danish \u0027hæve\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"ebonyFaire Venus sonne, that with thy cruell dart /At that good knight so cunningly didst roue /That glorious fire it kindled in his hart /\u0027Lay now thy deadly Heben bow apart\u0027 /And with thy mother milde come to mine ayde\u0027 - Spenser, \u0026quot;The First Booke of The Faerie Qveene\u0026quot\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hebephilia", "{\"term\":\"hebephilia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|hebe|philia|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Adult sexual attraction primarily or exclusively towards pubescent children\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hebephrenia", "{\"term\":\"hebephrenia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ἥβη\u0027 (youthful beauty) (also \u0027ἥβη\u0027 (the goddess w:hebe (mythology)) + \u0027φρήν\u0027 (mind)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A type of mental disorder occurring during puberty\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A form of schizophrenia characterised by inappropriate behaviour and emotional responses\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hebraism", "{\"term\":\"hebraism\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027hebraeus\u0027 (or Ancient greek (to 1453) \u0027ἑβραῖος\u0027 {{suffix||ism|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the identification of a usage, trait, or characteristic of the Hebrew language. By successive extension it is sometimes applied to the Jewish people, their faith, national ideology, or culture\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Excessive use of expressions derived from Hebrew\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hebrews", "{\"term\":\"hebrews\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The nineteenth book of the New Testament of the Bible, the epistle of w:Saint St Paul to the Hebrews\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }